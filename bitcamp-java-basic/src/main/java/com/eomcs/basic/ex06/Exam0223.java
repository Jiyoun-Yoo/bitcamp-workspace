// 흐름 제어문 - switch와 break

package com.eomcs.basic.ex06;

public class Exam0223 {
  public static void main(String[] args) {
    int score = 60;
    // break문을 쓰지 않으면계속 이어서 실행된다.
    //  => 일부러 쓰지 않을 때가 있다.
    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
      case 80:
      case 70:
        System.out.println("B");
      case 60:
      case 50:
      case 40:
        System.out.println("C");
        break;
      default:
        System.out.println("F");
    }
  }
}
