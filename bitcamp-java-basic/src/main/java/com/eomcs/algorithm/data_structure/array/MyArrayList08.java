package com.eomcs.algorithm.data_structure.array;

// 테스트1 - MyArrayListTest
//  01) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다.
//  02) 인스턴스를 추가하는 add() 메서드를 정의한다.
//  03) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의한다.
//  4) 인스턴스를 특정 위치에 삽입하는 add(int, Object) 메서드를 정의한다.
//  05) 특정 위치의 값을 항목을 인스턴스로 교체하는 set(int, Object) 메서드를 정의한다.
//  06) 특정 위치의 항목을 제거하는 remove(int) 메서드를 정의한다.

// 테스트2 - MyArrayListTest2
//  07) add()할 때 배열의 크기를 넘는 경우, 배열의 크기를 늘린다.
//  08) add(int, Object)로 임의의 위치로 삽입할 때
//      - 배열의 크기가 작으면 크기를 늘린다.
//      - 인덱스가 유효하지 않으면 오류를 발생시킨다.
public class MyArrayList08 {
  static Object[] elementDate = new Object[5];
  static int size;

  static public boolean add(Object e) {
    if(size == elementDate.length) {
      grow();
    }
    elementDate[size++] = e;
    return true;
  }

  static private void grow() {
    System.out.println("오호라! 배열을 늘리자!");
    Object[] newArray = new Object[elementDate.length + (elementDate.length >> 1)];
    for(int i = 0; i < elementDate.length; i++) {
      newArray[i] = elementDate[i];
    }
    elementDate = newArray;
  }

  static public void add(int index, Object element) {
    // 배열의 크기가 작으면 크기를 늘린다.
    if(size == elementDate.length) {
      grow();
    }
    //인덱스가 유효하지 않으면 오류를 발생시킨다.
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
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

  static public Object remove(int index) {
    Object old = elementDate[index];
    for(int i = index; i < size -1; i++) {
      elementDate[i] = elementDate[i+1];
    }
    size--;
    return old;
  }

}
