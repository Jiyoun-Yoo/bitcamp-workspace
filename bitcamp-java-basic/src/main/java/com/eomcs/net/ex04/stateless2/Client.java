package com.eomcs.net.ex04.stateless2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);

    long clientId = 0;

    while (true) {
      System.out.println("연산자? ");
      String op = keyScan.nextLine();

      System.out.println("값? ");
      int value = Integer.parseInt(keyScan.nextLine());

      try (Socket socket = new Socket("localhost", 8888);
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream());) {

        out.writeLong(clientId);

        out.writeUTF(op);
        out.writeInt(value);

        out.flush();

        clientId = in.readLong();

        int result = in.readInt();
        System.out.printf("계산 결과: %d\n", result);

      } catch (Exception e) {

      }
    }
  }
}
