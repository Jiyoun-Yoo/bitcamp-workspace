// 생성자 - 파라미터를 받는 생성

package com.eomcs.oop.ex03;

public class Exam0421 {

  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    // 생성자가 한 개라도 있으면 기본 생성자가 자동으로 생성되지 않는다.
    public SmartPhone(int a) {
      System.out.println("SmartPhone() 생성자 호출됨!");
    }
  }

  public static void main(String[] args) {
    //SmartPhone objs1 = new SmartPhone(); // 컴파일 오류!
                                           // 기본생성자가 자동으로 생성되지 않아 호출할 수 없다.
    SmartPhone objs1 = new SmartPhone(100); // OK!
    //SmartPhone objs1 = new SmartPhone(3.14); // 컴파일 오류!
                                               // 파라미터값이 일치하지 않는다.
  }

}

// 생성자?
//  => 인스턴스(객체)를 생성한 후 사용하기 전에 (제대로 쓰일 수 있도록)
//     유효한(적당한) 값으로 초기화시키는 작업을 수행한다.

