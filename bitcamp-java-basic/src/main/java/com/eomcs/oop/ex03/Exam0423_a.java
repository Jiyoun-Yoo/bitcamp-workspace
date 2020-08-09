// 생성자 - 여러 개의 생성자 정의하기

package com.eomcs.oop.ex03;

public class Exam0423_a {

  static class SmartPhone {
    int volume;
    int bright;
    int contrast;

    // 파라미터가 다른 생성자를 여러 개 정의할 수 있다.
    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨!");
      this.volume = 50;
      this.bright = 50;
      this.contrast = 50;
      // 아무것도 지정하지 않으면, 모든 값이 50으로 초기화된다.
    }

    public SmartPhone(int volume) {
      System.out.println("SmartPhone(int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = 50;
      this.contrast = 50;
    }

    public SmartPhone(int volume, int bright) {
      System.out.println("SmartPhone(int, int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = 50;
    }

    public SmartPhone(int volume, int bright, int contrast) {
      System.out.println("SmartPhone(int, int, int) 생성자 호출됨!");
      this.volume = volume;
      this.bright = bright;
      this.contrast = contrast;
    }

    // 생성자 내에서 코드가 중복되고 있다.
    //  => 코드의 중복을 제거해보자!
  }

  public static void main(String[] args) {
    // 인스턴스를 생성할 때 생성자에 던지는 값에 따라
    // 자동으로 호출될 생성자가 결정된다.

    // 생성자가 여러 개 존재할 때는 파라미터에 전달하는 값으로 구분한다.
    new SmartPhone();
    new SmartPhone(80);
    new SmartPhone(70, 70);
    new SmartPhone(50, 70, 70);
  }

}
