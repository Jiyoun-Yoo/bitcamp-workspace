package com.eomcs.design_pattern.singleton;

class Car4 {
  String model;
  int cc;

  private static Car4 instance;

  private Car4() {}

  public static Car4 getInstance() {
    if(Car4.instance == null) {
      Car4.instance = new Car4();
    }
    return Car4.instance;
  }


}

public class Exercise {
  public static void main(String[] args) {
    Car4 c1 = Car4.getInstance();
    Car4 c2 = Car4.getInstance();

    System.out.println(c1 == c2);



  }
}
