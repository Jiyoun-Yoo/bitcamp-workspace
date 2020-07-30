// 흐름 제어문 - for (:)와 배열

package com.eomcs.basic.ex06;

public class Exam0450 {
  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

    // 배열의 처음부터 끝까지 값을 꺼내는 것이라면
    // 다음의 for 문법을 사용하라!
    //      for (배열에서 꺼낸 값을 저장할 수 있는 변수 선언 : 배열주소) 문장;
    for (String name : names)
      System.out.println(name);
  }
}

// for (:)
//  - 배열 전체를 반복하거나 컬렉션(collection) 객체 전체를 반복할 때 유용하다.
//  - 배열의 일부만 반복할 수는 없다.
//  - 배열의 값을 다룰 때 인덱스를 사용할 필요가 없어 편리하다.

// 문법:
//      for (변수 선언 : 배열, Iterable 구현) 문장;
//      for (변수 선언 : 배열, Iterable 구현) { 문장1; 문장2; ... }
//  - 변수의 타입은 배열이나 Iterable 구현체의 항목 타입과 같아야 한다.
//  - 반복문을 돌 떄마다 항목의 값을 꺼내 변수에 담는다.