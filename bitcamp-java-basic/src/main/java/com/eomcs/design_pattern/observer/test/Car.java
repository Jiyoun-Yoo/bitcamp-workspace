package com.eomcs.design_pattern.observer.test;

import java.util.ArrayList;
import java.util.List;

public class Car {

  List<CarObserver> observers = new ArrayList<>();

  public void addCarObserver(CarObserver observer) {
    observers.add(observer);
  }

  public void removeCarObserver(CarObserver observer) {
    observers.remove(observer);
  }

  private void notifyObserversOnStarted() {
    for (CarObserver observer : observers) {
      observer.carStarted();
    }
  }

  private void notifyObserversOnStopped() {
    for (CarObserver observer : observers) {
      observer.carStarted();
    }
  }

  public void start() {
    System.out.println("시동을 건다.");

    notifyObserversOnStarted();
  }

  public void run() {
    System.out.println("달린다.");
  }

  public void stop() {
    System.out.println("시동을 끈다.");

    notifyObserversOnStopped();
  }

}


