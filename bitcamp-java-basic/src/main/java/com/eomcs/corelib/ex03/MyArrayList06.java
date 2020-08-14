package com.eomcs.corelib.ex03;

// 테스트1 - MyArrayListTest
//  01) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다.
//  02) 인스턴스를 추가하는 add() 메서드를 정의한다.
//  03) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의한다.
//  04) 인스턴스를 특정 위치에 삽입하는 add(int, Object) 메서드를 정의한다.
//  05) 특정 위치의 값을 항목을 인스턴스로 교체하는 set(int, Object) 메서드를 정의한다.
//  06) 특정 위치의 항목을 제거하는 remove(int) 메서드를 정의한다.
public class MyArrayList06 {
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

  static public Object remove(int index) {
    Object old = elementDate[index];
    // 지정한 인덱스의 값을 old에 저장하고,
    // 그 다음 인덱스에 들어있는 값을 한 칸씩 당겨서 저장한다.
    for(int i = index; i < size -1; i++) {
      elementDate[i] = elementDate[i+1];
    }
    // 데이터를 제거하고 나면 배열의 사이즈를 하나 감소시켜야 한다.
    size--;
    return old;
  }

}
