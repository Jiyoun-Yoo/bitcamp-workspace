package com.eomcs.exception.ex2;

public class Calculator3 {

  public static int compute(String op, int a, int b) {
    switch (op) {
      case "+": return a + b;
      case "-": return a - b;
      case "*": return a * b;
      case "/": return a / b;
      case "%": return a % b;
      default:
        // 유효하지 않은 연산자인 경우 throw 명령을 이용하여 호출자에게
        // 오류 상황을 알린다.
        throw new RuntimeException("해당 연산자를 지원하지 않습니다.");
    }
  }
}
