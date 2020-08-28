package com.eomcs.pms;

import java.sql.Date;

public class TaskHandler {

  static class Task {
    String project;
    int no;
    String content;
    Date deadline;
    int status;
    String owner;
  }
  static final int LENGTH = 100;

  Task[] list = new Task[LENGTH];
  int size = 0;

  MemberHandler memberHandler;

  public TaskHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }

  public void add() {
    System.out.println("[작업 등록]");

    Task task = new Task();
    task.project = Prompt.inputString("프로젝트? ");
    task.no = Prompt.inputInt("번호? ");
    task.content = Prompt.inputString("내용? ");
    task.deadline = Prompt.inputDate("마감일? ");
    task.status = Prompt.inputInt("상태? \n0: 신규\n1: 진행중\n2: 완료\n> ");
    task.owner = Prompt.inputString("담당자? ");

    while(true) {
      String name = Prompt.inputString("담당자?(취소: 빈 문자열) ");
      if(name.length() == 0) {
        return;
      } else if(memberHandler.findByName(name) != null) {
        task.owner = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }

    list[size++] = task;
  }

  public void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < size; i++) {
      Task task = list[i];
      String stateLabel = null;
      switch (task.status) {
        case 1:
          stateLabel = "진행중";
        case 2:
          stateLabel = "완료";
        case 3:
          stateLabel = "신규";
      }

      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          task.no, task.content, task.deadline, stateLabel, task.owner);
    }
  }

}
