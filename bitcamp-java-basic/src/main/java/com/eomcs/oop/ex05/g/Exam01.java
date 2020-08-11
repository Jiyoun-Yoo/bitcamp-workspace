// 상속 - 생성자 호출 순서

package com.eomcs.oop.ex05.g;

public class Exam01 {
  public static void main(String[] args) {
    B obj = new B();
    System.out.printf("v1 = %d, v2 = %d, v3 = %d\n", obj.v1, obj.v2);
  }
}