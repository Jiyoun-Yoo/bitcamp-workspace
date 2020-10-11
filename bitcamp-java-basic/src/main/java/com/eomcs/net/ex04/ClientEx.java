package com.eomcs.net.ex04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// 클라이언트 : 연결을 요청하는 쪽
public class ClientEx {
  public static void main(String[] args) throws Exception {
    DatagramSocket socket = new DatagramSocket();

    String receiver = "localhost";
    int port = 8888;

    byte[] bytes = "Hello".getBytes("UTF-8");

    DatagramPacket packet = new DatagramPacket(
        bytes, bytes.length, InetAddress.getByName(receiver), port);

    socket.send(packet);
    System.out.println("데이터 전송 완료!");

    socket.close();
  }
}
