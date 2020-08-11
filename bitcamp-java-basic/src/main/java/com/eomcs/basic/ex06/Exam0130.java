// 흐름 제어문 - if문의 조건

package com.eomcs.basic.ex06;

public class Exam0130 {
  public static void main(String[] args) {

    // if문의 조건은 반드시 boolean 데이터여야 한다.
    if (true) System.out.println("1111");
    if (false) System.out.println("2222");
    if (10 < 8 + 5) System.out.println("3333");

    // 그 외의 모든 데이터 타입은 컴파일 오류이다.
    // if (1) System.out.println("4444"); //컴파일 오류!
    // if (3.14f) System.out.println("4444"); //컴파일 오류!
    // if (0b0110 & 0b0011) System.out.println("4444"); //컴파일 오류!

    // if문에서 == 연산자를 통해 a가 100이 맞는지 확인한다.
    int a = 100;
    if (a == 100) System.out.println("5555"); // OK!

    // 다음과 같이 == 연산자 대신 =를 사용한 경우은 a변수에 100을 넣는다.
    // 그런데 a가 boolean이 아니기 때문에 컴파일 오류가 발생한다.
    // if (a = 100) System.out.println("6666") // 컴파일 오류!

    boolean b;
    if (b = true) System.out.println("된다!");

  }
}
