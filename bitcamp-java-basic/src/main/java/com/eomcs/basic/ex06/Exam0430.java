// 흐름 제어문 - for 중첩과 break

package com.eomcs.basic.ex06;

public class Exam0430 {
  public static void main(String[] args) {
    // for문의 중첩
    for(int i = 1; i <= 10; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}