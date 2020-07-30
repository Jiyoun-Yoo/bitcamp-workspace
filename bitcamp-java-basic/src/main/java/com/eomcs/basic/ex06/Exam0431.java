// 흐름 제어문 - for 중첩과 break

package com.eomcs.basic.ex06;

public class Exam0431 {
  public static void main(String[] args) {
    // break
    for (int i = 1; i <= 10; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
        if (j == 5)
          break; // break는 소속된 현재 반복문을 멈춘다.
      }
      System.out.println();
    }
  }
}