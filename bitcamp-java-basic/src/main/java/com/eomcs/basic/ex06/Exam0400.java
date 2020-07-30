// 반복문 for

package com.eomcs.basic.ex06;

public class Exam0400 {
  public static void main(String[] args) {
    // for문 문법
    //      for (변수 선언 및 초기화; 조건; 증감문) 문장1;
    //      for (변수 선언 및 초기화; 조건; 증감문) { 문장1; 문장2; ... }

    for (int i = 0; i < 5; i++) {
      System.out.print("=> ");
      System.out.println(i);
    }

    // 증감문의 위치를 바꿀 수 있다.
    for (int i = 0; i < 5;) {
      System.out.print("=> ");
      System.out.println(i);
      i++;
    }

    // 변수 선언을 따로 할 수 있다.
    int a = 0;
    for (; a < 5;) {
      System.out.print("=> ");
      System.out.println(a);
      a++;
    }
    // 반복문 안에 변수를 선언한 경우 반복문 밖에서는 그 변수를 사용할 수 없다.
    // 변수를 따로 선언한 경우 변수는 main에 소속된 변수!
    //      => 반복문의 밖에서도 그 변수를 사용할 수 있다.

    System.out.println("-----------------------------");

    // 하지만 반복문 안에 변수를 선언하고 그 안에서만 사용하는 것을 권장!
    // 반복문 안에 변수를 선언하면,
    // 반복문이 돌아가는 동안만 그 변수를 사용하고, 반복문이 끝나면 변수는 사라진다.
    for (int i = 0; i < 5; i++) {
      System.out.print("=> ");
      System.out.println(i);
    }

    for (int i = 0; i < 3; i++) {
      System.out.print("=> ");
      System.out.println(i);
    }
    // 두 반복문에서 사용된 변수는 이름은 둘 다 i이지만
    // 서로 다른 변수이다.

    System.out.println("-----------------------------");

    // 여러 변수를 나열하여 선언할 수도 있다.
    // 증감문에도 여러 변수를 넣을 수 있다.
    for (int i = 1, j =2; i <= 10; i += 2, j += 2) {
      System.out.printf("=> %d, %d\n", i, j);
    }
  }
}
