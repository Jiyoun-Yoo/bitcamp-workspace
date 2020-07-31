// 흐름 제어문 - for 중첩과 break

package com.eomcs.basic.ex06;

public class Exam0431 {
  public static void main(String[] args) {
    // break
    //  - 현재 소속된 반복문을 멈춘다.
    for (int i = 1; i <= 10; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
        if (j == 5)
          break;
          // break가 현재 소속된 반복문은 안쪽 for문!
          // j == 5이면 소속된 반복문을 멈추므로, 안쪽 for문의 증감문을 수행하지 않는다.
          //  - j는 5이상으로 증가되지 않는다!
      }
      System.out.println();
    }
  }
}