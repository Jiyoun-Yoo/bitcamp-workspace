package com.eomcs.algorithm.data_structure.array;

// 테스트1: MyArrayListTest
//  01) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다.
//  02) 인스턴스를 추가하는 add() 메서드를 정의한다.
public class MyArrayList02 {
  static Object[] elementDate = new Object[5];
  static int size;

  static public boolean add(Object e) {
    elementDate[size++] = e;
    return true;
  }

}
