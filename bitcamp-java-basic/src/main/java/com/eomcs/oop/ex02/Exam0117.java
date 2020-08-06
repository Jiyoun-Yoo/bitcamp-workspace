package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score2;

public class Exam0117 {

  public static void main(String[] args) {

    Score2 s1;
    s1 = new Score2();

    // Score 클래스에
    // 변수를 초기화하는 init라는 메서드를 추가하였다.
    s1.init("홍길동", 100, 90, 87);
    s1.compute();

    Score2 s2 = new Score2();
    s2.init("임꺽정", 90, 100, 100);
    s2.compute();

    // 어떻게 하면 코드를 더 간결하게 할 수 있을까?

    printScore(s1);
    printScore(s2);
  }

  static void printScore(Score2 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver );
  }

}
