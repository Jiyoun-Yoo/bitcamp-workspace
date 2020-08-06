// 클래스 사용 전

package com.eomcs.oop.ex02;

public class Exam0100 {

  public static void main(String[] args) {
    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 87;
    int sum = kor + eng + math;
    float aver = sum / 3f;

    printScore(name, kor, eng, math, sum, aver);
  }

  // 데이터 값을 다룰 수 있는 연산자를 정의해보자.
  //  - 다음 메서드는 국, 영, 수 값의 합계와 평균을 계산하는 연산자이다.
  static void printScore(String name, int kor, int eng, int math, int sum, float aver) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", name, kor, eng, math, sum, aver );
  }

}
