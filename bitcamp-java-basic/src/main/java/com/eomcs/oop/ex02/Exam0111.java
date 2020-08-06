// 사용자 정의 데이터 타입

package com.eomcs.oop.ex02;

public class Exam0111 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    // 변수가 아니다. 변수를 만들기 위한 설계도이다.
    // new 연산자를 사용해서 변수를 만들어야 생성된다.
  }

  public static void main(String[] args) {

    Score s1;
    s1 = new Score();
    // Score 설계도에 따라 만든 변수 목록 (인스턴스)
    // Heap 영역에 변수를 생성

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3f;

    printScore(s1);

    // 또 다른 한 사람의 데이터를 추가한다면?
    // 새로 인스턴스를 만들어 추가할 수 있다.
    Score s2 = new Score();
  }

  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver );
  }

}
