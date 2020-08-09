// 생성자 - 생성자 호출 막기 = 인스턴스 생성을 막기

package com.eomcs.oop.ex03;

class SmartPhone {
  int volume;
  int bright;
  int contrast;

  // 생성자의 접근 범위를 private으로 설정하면 외부에서 접근할 수 없기 때문에
  // 생성자를 호출할 수 없다.
  // 결국 인스턴스를 생성하지 못하게 만든다.
  private SmartPhone() {
    System.out.println("SmartPhone() 생성자 호출됨!");
  }

  public SmartPhone(int volume) {
    System.out.println("SmartPhone(int) 생성자 호출됨!");
    this.volume = volume;
    this.bright = 50;
    this.contrast = 50;
  }
}

public class Exam0424 {

  public static void main(String[] args) {
    // private으로 접근을 제한한 경우
    // 생성자의 접근이 막혀있기 때문에 다른 클래스에서 생성자를 호출할 수 없다.
    // 따라서 new 명령으로 객체를 생성할 수 없도록 만든다.
    //SmartPhone ojb1 = new SmartPhone(); //  컴파일 오류!
    SmartPhone ojb2 = new SmartPhone(50);
  }

}
