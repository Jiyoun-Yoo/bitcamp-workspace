package com.eomcs.oop.ex02.util;

public class Score4 {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

  // 인스턴스가 생성될 때 호출되는 메서드 => 생성자!
  // 리턴 타입을 적지 않고, 그 이름을 클래스와 동일하게 한다.
  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    this.compute();
  }

}