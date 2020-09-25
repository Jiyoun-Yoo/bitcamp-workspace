package com.eomcs.net.ex02;

import java.net.Socket;

public class Client {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8888);

    System.out.println("서버와 연결되었음!");

    socket.close();
    System.out.println("서버와 연결을 끊었음!");
  }
}
