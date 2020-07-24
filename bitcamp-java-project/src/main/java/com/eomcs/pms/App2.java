package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    
    Scanner keyInput = new Scanner(System.in);
    
    System.out.println("[프로젝트]");
    
    final int MAX_LENGTH = 5;
    int[] no = new int[MAX_LENGTH];
    String[] title = new String[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] startDate = new Date[MAX_LENGTH];
    Date[] endDate = new Date[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];
    String[] members = new String[MAX_LENGTH];
    
    int count = 0;
    
    for(int i = 0; i < 5; i++) {
      count++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine(); // 쓰레기 버리기
      
      System.out.print("프로젝트명? ");
      title[i] = keyInput.nextLine();
      
      System.out.print("내용? ");
      content[i] = keyInput.nextLine();
      
      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyInput.nextLine());
      // 날짜라는 리모콘에 담는다. <- 사용자가 입력한 숫자를 날짜 도구에 담겠다.
      
      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());
      
      System.out.print("만든이? ");
      owner[i] = keyInput.nextLine();
      
      System.out.print("팀원? ");
      members[i] = keyInput.nextLine();
      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      System.out.println();
      
      if (response.equalsIgnoreCase("y") == false) {
        break;
      }
    }
    
    keyInput.close();
    
    System.out.println("---------------------------------");
    
    for (int i = 0 ; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }
}
