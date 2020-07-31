package com.eomcs.pms;

import java.sql.Date;

public class App2 {
  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    // 여러 개의 프로젝트 정보를 입력받기 위해 변수 준비
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];

    int count = 0;

    System.out.println("[프로젝트]");

    for (int i = 0; i < LENGTH; i ++) {
      count ++;

      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine(); // 쓰레기 버리기

      System.out.print("프로젝트명? ");
      title[i] = keyInput.nextLine();

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("시작일? ");
      startDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
      // 날짜라는 리모콘에 담는다. <- 사용자가 입력한 숫자를 날짜 도구에 담겠다.

      System.out.print("종료일? ");
      endDate[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[i] = keyInput.nextLine();

      System.out.print("팀원? ");
      members[i] = keyInput.nextLine();

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
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }
}
