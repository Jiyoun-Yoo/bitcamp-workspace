// 스태틱 초기화 블록(static initializer) - 클래스 메서드 사용

package com.eomcs.oop.ex03;

public class Exam0630 {
  public static class A {
    static int a; // 스태틱 변수

    static void m() {} // 스태틱 메서드

    // 클래스가 로딩될 때 스태틱 초기화 블록은 실행된다.
    // 여러 개의 스태틱 블록이 있을 때, 컴파일러는 한 개의 블록으로 합친다.
    //  - 바이트 코드(Exam0630$A.class)를 확인해 보라.

    static {
      System.out.println("Static{} 11111");
    }

    static {
      System.out.println("Static{} 22222");
    }
  }

  public static void main(String[] args) {

    // 클래스가 로딩되는 경우
    //  2) 클래스 멤버(필드와 메서드)를 최초로 사용할 때
    //    - 클래스 메서드를 호출할 때
    A.m();

    System.out.println("종료!");
  }
}