// 메서드 레퍼런스 이해!

package com.eomcs.oop.ex12;

public class Exam0810 {

  interface Factory {
    Object create();
  }

  static class Car {}

  public static void main(String[] args) {

    // 1) 로컬 클래스로 인터페이스 구현체를 만든다.
    class CarFactory implements Factory {
      @Override
      public Object create() {
        return new Car();
      }
    }
    Factory f1 = new CarFactory(); // 공장을 언제든지 더 만들 수 있다.
    Car car1 = (Car) f1.create(); // CarFactory.create()의 리턴 타입이 Object이므로 형변환한다.

    // 2) 익명 클래스로 인터페이스 구현체를 만든다.
    Factory f2 = new Factory() {
      @Override
      public Object create() {
        return new Car();
      }
    }; // 공장을 딱 한 번만 만들 수 있다.
    Car car2 = (Car) f2.create();

    // 3) 람다로 인터페이스 구현체를 만든다.
    Factory f3 = () -> new Car();
    Car car3 = (Car) f2.create();

    // 4) 기존에 존재하는 메서드로 인터페이스 구현체를 만든다.
    Factory f4 = Exam0810::createCar;
    Car c4 = (Car) f4.create();

    System.out.println("완료!");
  }

  public static Car createCar() {
    return new Car();
  }

}
