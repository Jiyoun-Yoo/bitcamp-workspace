// Worker 구현체

package com.eomcs.oop.ex09.a.after;

public class JubuWorker implements Worker {
  // 인터페이스 구현체(인터페이스를 구현하는 클래스)는
  // 반드시 인터페이스에 선언된 모든 메서드를 구현해야 한다.
  @Override
  public void execute() {
    System.out.println("주부로 일합니다.");
  }
}
