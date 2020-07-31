package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {

    class Project{
        int no;
        String title;
        String content;
        Date startDate;
        Date endDate;
        String owner;
        String members;
    }

    Scanner keyInput = new Scanner(System.in);

    final int LENGTH = 100;
    Project[] projects = new Project[LENGTH];

    int count = 0;

    System.out.println("[프로젝트]");

    for (int i = 0; i < LENGTH; i ++) {
      count ++;

      Project p = new Project();

      System.out.print("번호? ");
      p.no = keyInput.nextInt();
      keyInput.nextLine(); // 쓰레기 버리기

      System.out.print("프로젝트명? ");
      p.title = keyInput.nextLine();

      System.out.print("내용? ");
      p.content = keyInput.nextLine();

      System.out.print("시작일? ");
      p.startDate = Date.valueOf(keyInput.nextLine());
      // 날짜라는 리모콘에 담는다. <- 사용자가 입력한 숫자를 날짜 도구에 담겠다.

      System.out.print("종료일? ");
      p.endDate = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      p.owner = keyInput.nextLine();

      System.out.print("팀원? ");
      p.members = keyInput.nextLine();

      projects[i] = p;

      System.out.println();

      System.out.println("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) // response가 y가 아니면
        break; // break;를 실행하여 반복문을 빠져나간다.

        System.out.println(); // 입력을 계속한다면 한 줄 띄워준다.
    }

    keyInput.close();

    System.out.println("---------------------------------------");
    for (int i = 0; i < count; i++) {
      Project p = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
        p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }
}
