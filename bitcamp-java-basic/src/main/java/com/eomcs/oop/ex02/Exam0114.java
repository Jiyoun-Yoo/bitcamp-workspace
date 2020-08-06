package com.eomcs.oop.ex02;

public class Exam0114 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    // 클래스 메서드
    //  - static이 붙은 메서드이다.
    //  - 특정 인스턴스에 대해 사용하는 것이 아니라, 모든 인스턴스에 대해 사용할 수 있다.
    //  - 특정 인스턴스의 값을 다루고 싶다면 파라미터로 그 인스턴스의 주소를 받아야 한다.
    static void computeScore(Score s) {
      s.sum = s.kor + s.eng + s.math;
      s.aver = s.sum / 3f;
    }

    // 메서드를 이용하여 이 타입의 데이터를 다룰 수 있는 연산자를 정의한다.
    //  - 사용자 정의 데이터 타입 입장에서는 메서드가 연산자 역할을 한다.
    //  - 즉 사용자 정의 데이터 타입에 메서드를 정의하는 것은
    //    그 데이터를 다룰 연산자를 정의하는 것이다.

    // 조금 더 직관적으로 수정해볼 수 없을까?
  }

  public static void main(String[] args) {

    Score s1;
    s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    Score.computeScore(s1);
    // computeScore()를 Score 클래스 안으로 옮긴 후에는,
    // 클래스명.메서드()로 호출해야 한다.

    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    Score.computeScore(s2);

    printScore(s1);
    printScore(s2);
  }

  // 웹 페이지의 상황에 따라 달라질 수 있어서
  // Score 클래스에 포함하지 않았다.
  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver );
  }

}
