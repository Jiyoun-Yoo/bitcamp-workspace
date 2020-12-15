// 애노테이션 프로퍼티 값 추출 - 배열 값 추출
package com.eomcs.annotation.ex5;

public class Exam03 {

  public static void main(String[] args) {
    Class<?> clazz = MyClass3.class;
    MyAnnotation3 obj = clazz.getAnnotation(MyAnnotation3.class);

    printValues(obj.v1());
    printValues(obj.v2());
    printValues(obj.v3());
  }

  static void printValues(String[] values) {
    for (Object value : values) {
      System.out.printf(value + ", ");
    }
    System.out.println();
  }

  static void printValues(int[] values) {
    for (Object value : values) {
      System.out.printf(value + ", ");
    }
    System.out.println();
  }

  static void printValues(float[] values) {
    for (Object value : values) {
      System.out.print(value + ", ");
    }
    System.out.println();
  }
}


