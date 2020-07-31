// 반복문 for

package com.eomcs.basic.ex06;

import java.util.ArrayList;
import java.util.Date;

public class Exam0401 {
  public static void main (String[] args) {
    // for문 문법
    //      for (변수 선언 및 초기화; 조건; 증감문) 문장1;
    //      for (변수 선언 및 초기화; 조건; 증감문) { 문장1; 문장2; ... }

    int[] scores1 = new int[5];
    scores1[0] = 100;
    scores1[1] = 90;
    scores1[2] = 80;
    scores1[3] = 70;
    scores1[4] = 60;

    // 배열에 들어있는 값을 모두 출력하기
    for (int i = 0; i < scores1.length; i++) {
      System.out.println(scores1[i]);
    }

    System.out.println("-----------------------------");

    // 배열에 들어있는 값을 한 칸씩 건너뛰고 출력하기
    for (int i = 0; i < scores1.length; i += 2) {
      System.out.println(scores1[i]);
    }

    System.out.println("-----------------------------");

    // 배열에 들어있는 값 전체를 출력하는 더 편한 방법!!!
    for (int value : scores1) {
      System.out.println(value);
    }

    System.out.println("-----------------------------");

    // 배열은 사이즈가 고정되어 있다는 단점이 있다.
    // ArrayList는 넣고싶은 만큼 값을 넣을 수 있다.
    ArrayList scores2 = new ArrayList();
    scores2.add(100);
    scores2.add(3.14f);
    scores2.add("오호라");
    scores2.add(true);
    scores2.add('헐');
    scores2.add(new Date());
    // 여러 데이터 타입을 담을 수도 있다.

    for (int i = 0; i < scores2.size(); i++) {
      System.out.println(scores2.get(i));
    }

    for (Object value : scores2) {
      System.out.println(value);
    }

    System.out.println("-----------------------------");

    ArrayList<String> scores3 = new ArrayList();
    scores3.add("오호라1");
    scores3.add("오호라2");
    scores3.add("오호라3");
    scores3.add("오호라4");
    scores3.add("오호라5");
    // 담고 싶은 데이터 타입을 지정할 수도 있다.

    for (Object value : scores3) {
      System.out.println(value);
    }
  }
}
