// 흐름 제어문 - for 중첩과 break

package com.eomcs.basic.ex06;

public class Exam0433 {
  public static void main(String[] args) {
    // continue
    //  - 다음 줄로 가지 않고 소속된 반복문의 '증감문'으로 이동한다.
    for (int i = 1; i <= 10; i ++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 == 0)
          continue;
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}