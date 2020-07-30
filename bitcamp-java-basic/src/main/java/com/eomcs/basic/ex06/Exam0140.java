// 흐름 제어문 - if ~ else문

package com.eomcs.basic.ex06;

public class Exam0140 {
  public static void main(String[] args) {
    int age = 17;

    // if문 else문 없이 단독으로 사용할 수 있다.
    if (age < 19)
      System.out.println("미성년입니다.");

    // else문을 사용하는 아주 모범적인 예!
    if (age >= 19)
      System.out.println("성인입니다.");
    else
      System.out.println("미성년입니다.");

    // 여러 문장을 실행할 때 블록으로 묶어야 한다.
    if (age >= 20) {
      System.out.println("----------");
      System.out.println("성인입니다.");
    }
    else {
      System.out.println("----------");
      System.out.println("미성년입니다.");
    }

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (age >= 19) {
      System.out.println("----------");
      System.out.println("성인입니다.");
    }
    else
      System.out.println("미성년입니다.");

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (age >= 20)
      System.out.println("성인입니다.");
    else {
      System.out.println("----------");
      System.out.println("미성년입니다.");
    }

  }
}

// 잘못사용한 예)
//  - else문만 단독으로 사용할 수 없다.
//    항상 if문과 짝을 이루어 사용한다.

