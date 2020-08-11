package com.eomcs.pms;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }

  static final int LENGTH = 100;
  static Project[] list = new Project[LENGTH];
  static int size = 0;

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    Project p = new Project();
    p.no = Prompt.promptInt("번호? ");
    p.title = Prompt.promptString("프로젝트명? ");
    p.content = Prompt.promptString("내용? ");
    p.startDate = Prompt.promptDate("시작일? ");
    p.endDate = Prompt.promptDate("종료일? ");
    p.owner = Prompt.promptString("만든이? ");
    p.members = Prompt.promptString("팀원? ");

    list[size] = p;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < size; i++) {
      Project p = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }

}
