package com.eomcs.oop.ex06.c;

public class A2 extends A {
  int age;

  // print2는 새로운 메서드! 오버라이딩 한 메서드 아님!
  void print2() {
    System.out.printf("'%s(%d)'님 반갑습니다!\n", this.name, this.age);
  }
}
