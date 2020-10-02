package com.eomcs.net.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
  public static void main(String[] args) throws Exception {
    // 서버와 입출력 테스트 - byte stream : Data 주고받기

    try (Scanner keyScan = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream())) {

      System.out.println("서버와 연결되고, 입출력 스트림도 준비하였음!");

      System.out.println("데이터를 보내기 전에 잠깐!");
      keyScan.nextLine();

      // 서버에 다양한 데이터 값을 전송한다.
      out.writeInt(1234567890);
      out.writeByte(100);
      out.writeFloat(3.1415f);
      out.writeUTF("안녕하세요");
      System.out.println("서버에 데이터를 보냈음!");

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
