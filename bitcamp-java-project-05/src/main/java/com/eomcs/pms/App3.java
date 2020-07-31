package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {

    class Task {
      int no;
      String content;
      Date completeDate;
      String state;
      String worker;
      }

    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    final int LENGTH = 100;
    Task[] task = new Task[LENGTH];

    int count = 0;

    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String project = keyInput.nextLine();

    for (int i = 0; i < LENGTH; i++) {
      count++;

      Task t = new Task();

      System.out.print("번호? ");
      t.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      t.content = keyInput.nextLine();

      System.out.print("완료일? ");
      t.completeDate = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.println("> ");
      int stateTitle = keyInput.nextInt();
      switch (stateTitle) {
        case 0:
          t.state = "신규";
          break;
        case 1:
          t.state = "진행중";
          break;
        case 2:
          t.state = "완료";
          break;
      }
      keyInput.nextLine();

      System.out.print("담당자? ");
      t.worker = keyInput.nextLine();

      task[i] = t;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }

    keyInput.close();

    System.out.println("--------------------------");

    System.out.println("["+ project +"]");
    for (int i = 0; i < count; i ++) {
      Task t = task[i];
      System.out.printf("%d, %s, %s, %s, %s ",
          t.no, t.content, t.completeDate.toString(), t.state, t.worker);
    }
  }
}
