package com.eomcs.basic.ex07.assignment;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);

    // 작업
    final int LENGTH = 10;
    String[] project = new String[LENGTH];
    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] completedDate = new Date[LENGTH];
    String[] state = new String[LENGTH];
    String[] worker = new String[LENGTH];
    int count = 0;

    for(int i = 0; i < LENGTH; i ++) {
      count++;

      System.out.println("[작업]");

      System.out.print("프로젝트? ");
      project[i] = keyInput.nextLine();

      System.out.print("번호? ");
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str); // 문자열을 숫자로 바꾼다.

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      completedDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.println("> ");
      state[i] = keyInput.nextLine();

      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();

      System.out.println("계속 입력하시겠습니까? (y/N) ");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break;
      }

    }

    keyInput.close();

    System.out.println("--------------------------");

    for (int i = 0; i < count; i++) {
      String stateTitle;
      switch (state[i]) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
        default:
          stateTitle = "완료";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], content[i], completedDate[i], stateTitle, worker[i]);
    }

  }
}
