package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.pms.listener.DataHandlerListener;
import com.eomcs.pms.listener.RequestMappingListener;

public class ServerApp {

  // 클라이언트가 "stop" 명령을 보내면 이 값이 true로 변경된다.
  //  - 이 값이 true이면 다음 클라이언트가 접속할 때 서버를 종료한다.
  static boolean stop = false;

  static Map<String, Object> context = new Hashtable<>();

  List<ApplicationContextListener> listeners = new ArrayList<>();

  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listeners.remove(listener);
  }

  public void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextInitialized(context);
    }
  }

  public void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }

  public void service(int port) {

    notifyApplicationContextListenerOnServiceStarted();

    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("서버 실행 중...");

      while (true) {
        Socket clientSocket = serverSocket.accept();

        if (stop) {
          break;
        }

        new Thread(() -> handleClient(clientSocket)).start();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    notifyApplicationContextListenerOnServiceStopped();
  }

  public static void main(String[] args) {
    ServerApp server = new ServerApp();

    // 옵저버 등록
    server.addApplicationContextListener(new AppInitListener());
    server.addApplicationContextListener(new DataHandlerListener());
    server.addApplicationContextListener(new RequestMappingListener());

    server.service(8888);
  }

  private static void handleClient(Socket clientSocket) {
    InetAddress address = clientSocket.getInetAddress();
    System.out.printf("클라이언트(%s)가 연결되었습니다.\n", address.getHostAddress());

    try (Socket socket = clientSocket;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream())) {

      while (true) {
        String request = in.readLine();

        Command command = (Command) context.get(request);
        if (command != null) {
          command.execute();
        } else {
          sendResponse(out, "해당 명령을 처리할 수 없습니다!");
        }

        sendResponse(out, request);
        if (request.equalsIgnoreCase("quit"))
          break;
        else if (request.equalsIgnoreCase("stop")) {
          stop = true; // 서버의 상태를 멈추라는 의미로 true로 설정한다.
          break;
        }
      }

    } catch (Exception e) {
      System.out.println("클라이언트와의 통신 오류!");
    }

    System.out.printf("클라이언트(%s)와의 연결을 끊었습니다.\n", address.getHostAddress());
  }

  private static void sendResponse(PrintWriter out, String message) {
    out.println(message);
    out.println();
    out.flush();
  }

}
