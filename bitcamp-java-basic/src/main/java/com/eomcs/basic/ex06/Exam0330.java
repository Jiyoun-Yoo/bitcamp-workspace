// 흐름 제어문 - 중첩된 반복문 탈출

package com.eomcs.basic.ex06;

public class Exam0330 {
  public static void main(String[] args) {
    int x = 2, y = 1;

    // 5 * 5 까지만 출력하라!

    while (x <= 9) {

      while (y < 9) { // break를 빠져나와 이 곳으로 온다.
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        if (x == 5 && y == 5)
          break; // 이 break는 자신이 소속된 가장 가까운 반복문을 나간다. (if문은 반복문 아님)
        y++;
      }

      System.out.println();
      x++;
      y = 1;

    }
    System.out.println("종료!!!");
  }
}
