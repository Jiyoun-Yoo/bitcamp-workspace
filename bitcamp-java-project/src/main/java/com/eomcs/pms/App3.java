package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    
    Scanner keyInput = new Scanner(System.in);
    
    final int MAX_LENGTH = 5;
    String project = null;
    
    int[] no = new int[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] completeDate = new Date[MAX_LENGTH];
    String[] state = new String[MAX_LENGTH];
    String[] worker = new String[MAX_LENGTH];
    
    int count = 0;
    
    System.out.println("[작업]");
    
    System.out.print("프로젝트? ");
    project = keyInput.nextLine();
    
    for (int i = 0; i < 5; i++) {
      count++;
      
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      
      System.out.print("내용? ");
      content[i] = keyInput.nextLine();
      
      System.out.print("마감일? ");
      completeDate[i] = Date.valueOf(keyInput.nextLine());
      
      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      state[i] = keyInput.nextLine();
      switch (state[i]) {
        case "0":
          state[i] = "신규";
//          break;
        case "1":
          state[i] = "진행중";
//          break;
        default:
          state[i] = "완료";
      }
      
      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();
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
    
    System.out.printf("[%s]\n",project);
    for (int i =0; i < 5; i++) {
      if (no[i] == 0) {
        break;
      }
      
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], content[i], completeDate[i], state[i], worker[i]);
     
//      switch (state[i]) {
//        case "0":
//          System.out.println("신규");
//          break;
//        case "1":
//          System.out.println("진행중");
//          break;
//        default:
//            System.out.println("완료");
//      }
      
//      System.out.printf("%s", worker[i]);
    }
  }
}
