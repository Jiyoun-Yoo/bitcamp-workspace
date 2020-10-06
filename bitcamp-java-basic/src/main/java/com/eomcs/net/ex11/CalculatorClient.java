package com.eomcs.net.ex11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String[] args) {
    Scanner keyboardScanner = new Scanner(System.in);

    while (true) {

      String input = prompt(keyboardScanner);
      if (input == null) {
        continue;
      } else if (input.equalsIgnoreCase("quit")) {
        break;
      }

      try (Socket socket = new Socket("localhost", 8888);
          PrintStream out = new PrintStream(socket.getOutputStream());
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
          sendRequest(out, input);
          readResponse(in);

      } catch (Exception e) {
        e.printStackTrace();
      }

    }

  }

  static String prompt(Scanner keyboardScanner) {
    System.out.print("계산식> ");
    String input = keyboardScanner.nextLine();

    if (input.equalsIgnoreCase("quit")) {
      return input;
    } else if (input.split(" ").length != 3) {
      System.out.println("입력 형식이 올바르지 않습니다.");
      return null;
    }
    return input;
  }

  static void sendRequest(PrintStream out, String message) {
    out.println(message);
    out.flush();
  }

  static void readResponse(BufferedReader in) throws Exception {
    while (true) {
      String input = in.readLine();
      if (input == null) {
        break;
      }
      System.out.println(input);
    }

  }

}
