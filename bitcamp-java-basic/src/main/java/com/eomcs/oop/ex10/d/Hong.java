package com.eomcs.oop.ex10.d;

public class Hong extends Student {

  @Override
  public void greet() {
    System.out.println("안녕하세요?");
  }

  @Override
  public void say() {
    System.out.println("반가워요, 저는 홍길동입니다.");
  }

  @Override
  public void fighting() {
    System.out.println("잘 부탁드립니다.");
  }

}
