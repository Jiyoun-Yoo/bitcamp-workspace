// 생성자 - 여러 개의 생성자 정의하기

package com.eomcs.oop.ex03;

public class Exam0430 {

  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    // 파라미터가 다른 생성자를 여러 개 정의할 수 있다.
    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨!");
    }

    public SmartPhone(int a) {
      System.out.println("SmartPhone(int) 생성자 호출됨!");
    }

    public SmartPhone(String str, int a) {
      System.out.println("SmartPhone(String, int) 생성자 호출됨!");
    }

    public SmartPhone(int a, String str) {
      System.out.println("SmartPhone(int, String) 생성자 호출됨!");
    }

    // 논리값을 받는 생성자는 없다!!
  }

  public static void main(String[] args) {
    // 인스턴스를 생성할 때 생성자에 던지는 값에 따라
    // 자동으로 호출될 생성자가 결정된다.

    // 생성자가 여러 개 존재할 때는 파라미터에 전달하는 값으로 구분한다.
    new SmartPhone();
    new SmartPhone(100);
    new SmartPhone("aaa", 100);
    new SmartPhone(100, "aaa");

    // 인스턴스를 생성한 후에 나중에 따로 생성자를 호출할 수는 없다!!
  }

}
