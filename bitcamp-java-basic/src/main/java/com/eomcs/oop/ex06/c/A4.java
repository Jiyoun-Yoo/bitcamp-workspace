package com.eomcs.oop.ex06.c;

public class A4 extends A3 {
  // 필드 오버라이딩
  String age;
  boolean working = false;

  // this.필드명
  //  => 현재 클래스에서 해당 필드를 찾는다. 없으면 상위 클래스로 따라 올라가면서 찾는다.
  //     현재 클래스부터 찾아 올라가는 것!
  // super.필드명
  //  => 상위 클래스에서부터 해당 필드를 찾는다. 없으면 계속 상위 클래스로 따라 올라간다.
  //     super 클래스부터 찾아 올라가는 것!
  void print3() {
    System.out.printf("'%s(%s, %d)'님 반갑습니다!\n", this.name, this.age, super.age);
  }

  void test() {
    System.out.printf("this.tel = %s, this.working = %s\n", this.tel, this.working);
    System.out.printf("super.tel = %s, super.working = %s\n", super.tel, super.working);
  }
}







