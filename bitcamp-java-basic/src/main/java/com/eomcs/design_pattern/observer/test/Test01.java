package com.eomcs.design_pattern.observer.test;

public class Test01 {

  public static void main(String[] args) {
    Car car = new Car();

    car.addCarObserver(new SafeBeltCarObserver());
    car.addCarObserver(new EngineOilCarObserver());
    car.addCarObserver(new BrakeOilCarObserver());
    car.addCarObserver(new LightOffCarObserver());
    car.addCarObserver(new SunRoofCarObserver());

    car.start();

    car.run();

    car.stop();

  }

}


