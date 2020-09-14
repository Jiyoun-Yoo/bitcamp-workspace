package com.eomcs.oop.ex11.e;

public class Exam0000 {

  static abstract class A {
    public abstract void print();
  }

  interface B {
    String name;
  }


  public static void main(String[] args) {

    A obj = new A() {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    };
    obj.print();

  }

}
