// 흐름 제어문 - for 중첩과 break

package com.eomcs.basic.ex06;

public class Exam0432 {
  public static void main(String[] args) {
    // break 라벨명;
    loop1: {
      for (int i = 1; i <= 10; i ++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
          if (j == 5)
            break loop1;
        }
        System.out.println();
      }
      System.out.println("-----------------------------");
      // j == 5일때, loop1을 빠져나가므로 위의 출력문은 실행 X
    }
  }
}