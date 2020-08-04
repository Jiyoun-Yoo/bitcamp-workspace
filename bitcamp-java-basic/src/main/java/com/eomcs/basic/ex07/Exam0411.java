package com.eomcs.basic.ex07;

public class Exam0411 {

  public static void main(String[] args) {
    int a = 100;
    System.out.println("main() >> " + a);
    m1(a);
    System.out.println(a + " << main()");
  }

  static void m1(int a) {
    a += 100;
    System.out.println("m1() >> " + a);
    m2(a);
    System.out.println(a + " << m1()");
  } // 실행 후 m1() 메모리 삭제

  static void m2(int a) {
    a += 100;
    System.out.println("m2() >> " + a);
    m3(a);
    System.out.println(a + " << m2()");
  } // 실행 후 m2() 메모리 삭제

  static void m3(int a) {
    a += 100;
    System.out.println("m3() : " + a);
  } // 실행 후 m3() 메모리 삭제

}
