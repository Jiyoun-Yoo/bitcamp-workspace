package com.eomcs.basic.ex05.assignment;

// 과제
//  다섯 개의 정수 값을 입력 받고 최소, 최대 값을 구하라.

// 실행 예)
//  입력? 4 17 -1 6 9

// 출력)
//  최소값: -1
//  최대값: 17

import java.util.Scanner;
import java.util.*; 

public class Test02_a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    int[] no = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.printf("%d번째 숫자를 입력하세요 > ", i+1);
      no[i]= input.nextInt();
    }
    
    int max = 0;
    int min = 0;
    
    for (int i = 0; i < 5; i++) {
      if (no[i] >= max) {
        max = no[i];
      }
      if (no[i] <= min) {
        min = no[i];
      }
    }
    
    System.out.println("입력한 숫자 " + Arrays.toString(no));
    System.out.println("최대값 : " + max);
    System.out.println("최소값 : " + min);
    
    input.close();
  }
}
