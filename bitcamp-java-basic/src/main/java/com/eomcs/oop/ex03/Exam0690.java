// 스태틱 초기화 블록 (static initializer) - 활용 I

package com.eomcs.oop.ex03;

public class Exam0690 {

  public static class A {
    static float pi;
    // 실무에서는 변수를 선언하면서 바로 초기화한다.
    //  => 컴파일하면 스태틱 블록에서 초기화한다!

    static float area(int r) {
      return pi * r *r;
    }

    // 스태틱 블록의 역할은
    // 클래스 멤버를 용하기 전에 유효한 값으로 초기화 시키는 것!
    static {
      pi = 3.14159f;
    }
  }

  public static void main(String[] args) throws Exception {
    System.out.println(A.area(25));
  }

}
