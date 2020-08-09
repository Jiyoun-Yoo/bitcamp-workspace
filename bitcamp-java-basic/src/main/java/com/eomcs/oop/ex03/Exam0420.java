// 생성자 - 기본 생성자

package com.eomcs.oop.ex03;

public class Exam0420 {

  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    // 다음과 같이 기본 생성자를 직접 정의할 수 있다.
    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨!");
    }
  }

  public static void main(String[] args) {
    SmartPhone objs1 = new SmartPhone();
    // 기본 생성자가 정말 호출되는지 알아본다.
    // 출력문이 없지만, 생성자가 호출된다면 생성자의 출력문이 호출될 것!
  }

}
