package com.eomcs.oop.ex02;

public class Exam0200 {

  /*
    다른 클래스에서도 Calculator를 사용하기 위해
    별도의 클래스 파일을 만든다. (재사용성을 높인다!!)
    독립시킨 클래스는 public을 붙여 사용 범위를 조정해야 한다.

  static class Calculator {
    static int result = 0;

    // 자기가 작업한 결과를 내부 변수에 저장한다.
    static void plus(int value) {
      result += value;
    }

    static void minus(int value) {
      result -= value;
    }

    static void multiple(int value) {
      result *= value;
    }

    static void divide(int value) {
      result /= value;
    }
  }

  */

  // 별도의 클래스를 만든다 => result를 그 클래스 안에서 관리한다.
  //  => 동시에 여러 식을 계산하기 위해 non-static 변수로 선언한다.
  //  => 레퍼런스를 편하게 사용하기 위해 non-static 메서드를 사용한다.

  public static void main(String[] args) {
    // 연산자 우선순위를 고려하지 말고 나온 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?

    Calculator c1 = new Calculator();

    // int result = 0;
    // 작업을 하는 쪽에서 작업 결과를 관리하도록
    // Calculator 클래스로 옮겨준다.

    // result = Calculator.plus(2, 3);
    // Calculator 클래스 내부에서 작업 결과를 관리하므로,
    // 메서드 실행 결과 값을 받을 변수를 main() 메서드에 선언하지 않아도 된다.
    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    printResult(c1.result); // 9를 넘겨준다
  }

  static void printResult(int value) {
    System.out.println("*****************");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("*****************");
  }

}
