package com.eomcs.oop.ex02.util;

public class Score2 {
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

  // 각각 변수에 값을 넣지 않고,
  // 한번에 초기화할 수 있는 메서드를 만든다.
  public void init(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

}