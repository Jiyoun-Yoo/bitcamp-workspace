// 흐름 제어문 - for (;;)와 배열

package com.eomcs.basic.ex06;

public class Exam0440 {
  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

    for (int i = 0; i < names.length; i++)
      System.out.println(names[i]);
  }
}