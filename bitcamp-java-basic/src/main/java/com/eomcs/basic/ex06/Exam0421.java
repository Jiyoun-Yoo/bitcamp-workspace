// 흐름 제어문 - for 반복문의 초기화 변수

package com.eomcs.basic.ex06;

public class Exam0421 {
  public static void main(String[] args) {
    // 변수를 초기화시키는 문장에 여러 개의 변수를 선언할 수 있다.
    // 변수 증가문에 여러 개의 문장을 작성할 수 있다.
    for (int i = 1, j =3, k = 5; i <= 10; i++, j--, k +=2)
      System.out.printf("(%d, %d, %d) ", i, j, k);
    System.out.println();
  }
}