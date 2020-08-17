package com.eomcs.algorithm.data_structure.array;

// 테스트1 - MyArrayListTest
//  01) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다.
//  02) 인스턴스를 추가하는 add() 메서드를 정의한다.
//  03) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의한다.
//  04) 인스턴스를 특정 위치에 삽입하는 add(int, Object) 메서드를 정의한다.
//  05) 특정 위치의 값을 항목을 인스턴스로 교체하는 set(int, Object) 메서드를 정의한다.
public class MyArrayList05 {
  static Object[] elementDate = new Object[5];
  static int size;

  static public boolean add(Object e) {
    elementDate[size++] = e;
    return true;
  }

  static public void add(int index, Object element) {
    for(int i = size; i > index ; i--) {
      elementDate[i] = elementDate[i-1];
    }
    elementDate[index] = element;
    size++;
  }

  static public Object get(int index) {
    return elementDate[index];
  }

  static public Object set(int index, Object element) {
    Object old = elementDate[index];
    elementDate[index] = element;
    return old;
  }

}
