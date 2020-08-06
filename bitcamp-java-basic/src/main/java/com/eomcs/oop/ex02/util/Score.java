package com.eomcs.oop.ex02.util;

public class Score {
  // 바깥으로 독립시킬 때는 static을 붙이면 안된다.
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
}