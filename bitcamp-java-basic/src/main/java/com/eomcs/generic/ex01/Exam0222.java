// 제네릭(Generic) 문법 정리 - 제네릭 파라미터 (타입을 <?>로 지정한 경우)

package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0222 {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */

  public static void main(String[] args) {
    // m1(ArrayList<?>)
    // => 모든 타입에 대해 ArrayList 객체를 파라미터로 넘길 수 있다.
    m1(new ArrayList()); // OK
    m1(new ArrayList<Object>()); // OK
    m1(new ArrayList<A>()); // OK
    m1(new ArrayList<B1>()); // OK
    m1(new ArrayList<B2>()); // OK
    m1(new ArrayList<C>()); // OK
  }

  static void m1(ArrayList<?> list) {
    // <?>는 어떤 타입을 담을지 제한을 두지 않는다.
    // 컴파일러는 파라미터로 받은 ArrayList가 어떤 타입의 값을 다루는지 알 수 없기 때문에
    // 그 타입인지 검사해야 하는 메서드를 사용할 때는 컴파일을 명확하게 해줄 수 없다.
    // 따라서 컴파일 오류를 발생시킨다.

    // 제네릭을 사용을 하면, 모호하게 사용하지 않도록 주의하라!
    // 정확하게 어떤 파라미터를 받는지 명시를 하는 것이 가장 좋은 방법이다.
    /*
    list.add(new Object());
    list.add(new A());
    list.add(new B1());
    list.add(new B2());
    list.add(new C());
     */

    Object obj1 = list.get(0);

    // 다음의 경우도 마찬가지로 get()의 리턴 타입이 무엇인지 결정할 수 없기 때문에
    // 컴파일을 명확하게 해줄 수 없다. 그래서 컴파일 오류가 발생한다.
    //A obj2 = list.get(0); // 컴파일 오류!

    // println()의 파라미터 타입이 Object이기 때문에 다음 코드는 오류가 아니다.
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    System.out.println(list.get(4));
  }
}
