package com.eomcs;

public class Test {
  public static void main(String[] args) {

    double d;
    d = 9.999999999999997; // 맨 뒤의 값이 반올림 되거나 잘린다.
    System.out.println(d);

    d = 999999999999999.7; // 맨 뒤의 값이 반올림 되거나 잘린다.
    System.out.println(d);

  }
}
