package com.eomcs.oop.ex12;

public class Exam0000 {

  interface Factory {
    Object create();
  }

  static class Car {}

  public static void main(String[] args) {

    // 로컬 클래스로 인터페이스 구현체를 만든다
    class MyCarFactory implements Factory {
      @Override
      public Object create() {
        return new Car();
      }
    }
    Factory f1 = new MyCarFactory();
    Car car1 = (Car) f1.create();

    // 익명 클래스로 인터페이스 구현체를 만든다.
    Factory f2 = new Factory() {
      @Override
      public Object create() {
        return new Car();
      }
    };
    Car car2 = (Car) f2.create();

    // 람다로 인터페이스 구현체를 만든다.
    Factory f3 = () -> new Car();
    Car c3 = (Car) f3.create();

    // 기존에 존재하는 메서드로 인터페이스 구현체를 만든다.
    Factory f4 = Exam0000::createCar;
    Car c4 = (Car) f4.create();

  }

  public static Car createCar() {
    return new Car();
  }

}
