// 오버라이딩(overriding) - 필드 오버라이딩

package com.eomcs.oop.ex06.c;

public class Exam0140 {
  public static void main(String[] args) {
    A4 obj1 = new A4();
    obj1.name = "홍길동";
    obj1.age = "20";
    //obj1.super.age = 20;  // 컴파일 오류!

    // 상위 레퍼런스의 인스턴스에 접근하고 싶다면, 형변환 하라!
    // 하지만 이 방법은 실무에서는 사용하지 않는다.
    ((A3)obj1).age = 20;

    obj1.print(); // print()는 A3의 메서드
    obj1.print3(); // print3()는 A4의 메서드
    System.out.println("------------------------------");
    obj1.test();
  }
}







