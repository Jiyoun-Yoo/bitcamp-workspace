// stateless 방식 - 계산기 서버 만들기

package com.eomcs.net.ex04.stateless;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {
  public static void main(String[] args) throws Exception {
    System.out.println("서버 실행 중...");

    ServerSocket ss = new ServerSocket(8888);

    while (true) {
      Socket socket = ss.accept();
      System.out.println("클라이언트 요청 처리!");
      // 일은 main T가 한다.
      try {
        processRequest(socket);
      } catch (Exception e) {
        System.out.println("클라이언트 요청 처리 중 오류 발생!");
        System.out.println("다음 클라이언트의 요청을 처리합니다.");
      }
    }
    // ss.close();
  }

  static void processRequest(Socket socket) throws Exception {
    try (Socket socket2 = socket;
        DataInputStream in = new DataInputStream(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());) {

      int a = in.readInt();
      String op = in.readUTF();
      int b = in.readInt();
      int result = 0;

      switch (op) {
        case "+":
          result = a + b;
          break;
        case "-":
          result = a - b;
          break;
        case "*":
          result = a * b;
          break;
        case "/":
          result = a / b;
          break;
      }
      out.printf("%d %s %d = %d\n", a, op, b, result);
    }
    // 작업을 수행한 후 try문을 나가서 연결을 끊기 때문에
    // 반복문을 사용하지 않는다.
    // 클라이언트와 서버가 연결되어있는 시간이 짧다.
  }
}


