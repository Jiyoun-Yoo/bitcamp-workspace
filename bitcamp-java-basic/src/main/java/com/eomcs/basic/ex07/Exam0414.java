// Stack과 Heap 메모리 영역

package com.eomcs.basic.ex07;

public class Exam0414 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) throws Exception {
    Score s = new Score();

    Score s2;
    s2 = createObject();
  }

  // Score 설계도에 따라 Heap에 생성한 메모리의 주소를 리턴
  // Score 클래스에 따라 Heap에 생성한 인스턴스 주소를 리턴
  // Score 클래스의 인스턴스를 생성한 후 그 주소를 리턴
  // Score 클래스의 인스턴스를 리턴
  // Score의 인스턴스를 리턴
  // Score 객체를 리턴 (현장에서 주로 쓰는 표현)
  //  => 객체의 주소를 리턴하는 것! 헷갈리지 말자!

  static Score createObject() {
    Score s = new Score();
    return s;
  }
}
