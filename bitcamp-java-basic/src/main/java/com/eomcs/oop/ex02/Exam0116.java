package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score;
// 다른 개발자도 Score 클래스를 사용할 수 있도록
// Score 클래스를 별도의 파일로 독립시킨다.

public class Exam0116 {

  public static void main(String[] args) {

    Score s1;
    s1 = new Score();

    // 각각 변수에 값을 넣는 것은 번거롭다!
    // 코드를 조금 더 간결하게 바꿀 수 없을까?
    //  => Score 클래스를 수정해보자!
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.compute();

    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    s2.compute();

    printScore(s1);
    printScore(s2);
  }

  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver );
  }

}
