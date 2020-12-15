// 클래스 정보 추출 - 클래스의 중첩 클래스 정보 알아내기
package com.eomcs.reflect.ex02;

public class Exam03 {

  static class A {

    static class B {
    } // static nested class

    class C {
    } // non-static nested class == inner class

    public void m() {
      class D {
      } // local class
    }

    public void m2() {
      Object obj = new Object() {}; // anonymous class
    }

    public static class E {
    }

    public class F {
    }

    public interface X {
    }
  }

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("com.eomcs.reflect.ex02.Exam03$A");

    // public 으로 공개된 중첩 클래스 및 인터페이스 정보를 가져온다.
    Class<?>[] nestedList = clazz.getClasses();

    for (Class<?> nested : nestedList) {
      System.out.println(nested.getName());
    }

// 출력 결과
//    com.eomcs.reflect.ex02.Exam03$A$E
//    com.eomcs.reflect.ex02.Exam03$A$F
//    com.eomcs.reflect.ex02.Exam03$A$X

//getClasses
// public으로 공개된 클래스만 접근 가능

  }

}
