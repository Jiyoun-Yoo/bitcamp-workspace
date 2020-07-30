// 흐름 제어문 - for 반복문

package com.eomcs.basic.ex06;

public class Exam0410 {
  public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감문) 문장;
    // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}

    // for문의 전형적인 예
    for (int i = 1; i <= 5; i++)
      System.out.println("i");

    // 실행 순서
    //  1) 변수 초기화 => int i = 1
    //  2) 조건 => i <= 10
    //  3) 문장 => System.out.pritln(i + " ")
    //  4) 변수 증가문 => i++
    // 조건이 참인 동안 2) ~ 4)를 반복한다.

    // for문에서 선언한 변수는 그 for문 안에서만 사용할 수 있다.
    // System.out.println(i); // 컴파일 오류!
  }
}