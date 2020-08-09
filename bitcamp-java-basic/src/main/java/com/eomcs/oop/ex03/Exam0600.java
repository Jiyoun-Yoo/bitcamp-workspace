// 초기화 블럭

package com.eomcs.oop.ex03;

public class Exam0600 {

  static class A {
    static int x = 100; // 변수 선언 + 변수 초기화 문장(variable initializer)
    static void m1() {}
    // static 변수 초기화 문장은 static 블록의 앞 부분에 삽입된다.

    int y = 100; // 변수 선언 + 변수 초기화 문장(variable initializer)
    // 인스턴스 변수 초기화 문장은 생성자의 앞 부분에 삽입된다.

    // static 초기화 블럭
    static {
      x = 200;
      // 클래스가 로딩되고,
      // 스태틱 필드가 생성된 후
      // 스태틱 블럭을 순서대로 실생한다.

      // 정확한 내용
      //  => static 블록이 여러개일 경우
      //     컴파일 과정에서 한 개의 static 블록으로 합친다.
      System.out.println("static 블록 #1");
    }

    // 인스턴스 초기화 블럭
    {
      y = 200;
      // 인스턴스가 생성되고
      // 즉시 인스턴스 블럭이 순서대로 실행된다.
      // 그 후 생성되가 호출된다.

      // 정확한 내용
      //  => 인스턴스 블럭은 컴파일 과정에서 모든 생성자의 첫 부분에 삽입된다.
      //     그리고 존재하지 않는 것처럼 제거된다.
      System.out.println("인스턴스 블록 #1");
    }

    public A() {
      y = 300;
      System.out.println("A() 생성자 호출됨!");
    }

    public A(int value) {
      System.out.println("A(int) 생성자 호출됨!");
    }

    {
      System.out.println("인스턴스 블록 #2");
    }

    static {
      System.out.println("static 블록 #2");
    }
  }

  static class B {
    static int x = 100;
    int y = 1000;

    static {
      x =  200;
    }

    public B() {
      y = 3000;
    }

    {
      y = 2000;
    }
    // 생성자 초기화 문장이 가장 나중에 실행된다.
    // y = 1000; --> y = 2000; --> y = 3000;
  }

  public static void main(String[] args) {
    System.out.println("실행!");

    // 레퍼런스를 선언한다고 해서 클래스가 로딩되지는 않는다.
    //  - static멤버를 사용하지 않는다면
    //    클래스 파일을 지워도 실행할 수 있다.
    A obj1;

    // static 멤버(멤버, 메서드)를 사용할 때 클래스가 로딩된다.
    //A.x = 100;
    //A.m1();

    System.out.println("--------------------");

    // 인스턴스를 생성하기 전에
    // 클래스가 로딩되지 않았다면 먼저 로딩한다.
    obj1 = new A();

    System.out.println(A.x);
    System.out.println(obj1.y);

    new A(100);
  }

}