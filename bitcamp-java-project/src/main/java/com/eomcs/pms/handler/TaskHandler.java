package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class TaskHandler {

  static class Task {
    int no;
    String content;
    Date deadline;
    String owner;
    int status;
  }
  static final int LENGTH = 100;
  static Task[] list = new Task[LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[작업 등록]");

    Task t = new Task();

    t.no = Prompt.promptInt("번호? ");
    t.content = Prompt.promptString("내용? ");
    t.deadline = Prompt.promptDate("마감일? ");
    t.status = Prompt.promptInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    t.owner = Prompt.promptString("담당자? ");

    list[size++] = t;
  }

  public static void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < size; i++) {
      Task t = list[i];
      String stateLabel = null;
      switch (t.status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          t.no, t.content, t.deadline, stateLabel, t.owner);
    }
  }

}
