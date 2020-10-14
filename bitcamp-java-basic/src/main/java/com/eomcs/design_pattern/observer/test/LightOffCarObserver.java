package com.eomcs.design_pattern.observer.test;

public class LightOffCarObserver extends AbstractCarObserver {

  @Override
  public void carStarted() {

  }

  @Override
  public void carStopped() {
    System.out.println("전조등을 끈다.");

  }

}
