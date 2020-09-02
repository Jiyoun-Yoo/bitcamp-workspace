package com.eomcs.algorithm.data_structure.array;

// 테스트1: MyArrayListTest
//  01) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다.
//  02) 인스턴스를 추가하는 add() 메서드를 정의한다.
//  03) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의한다.
//  04) 인스턴스를 특정 위치에 삽입하는 add(int, Object) 메서드를 정의한다.
public class MyArrayList04 {
  static Object[] elementDate = new Object[5];
  static int size;

  static public boolean add(Object e) {
    elementDate[size++] = e;
    return true;
  }

  static public void add(int index, Object element) {
    // 배열의 가장 끝 인덱스부터 지정한 인덱스 다음 인덱스에 들어있는 값을
    // 한 칸씩 옆으로 옮기는 작업을 수행한 후 지정한 인덱스에 값을 넣는다.
    for(int i = size; i > index ; i--) {
      elementDate[i] = elementDate[i-1];
    }
    elementDate[index] = element;
    // 데이터를 추가하고 나면 배열의 사이즈를 하나 증가시켜야 한다.
    size++;
  }

  static public Object get(int index) {
    return elementDate[index];
  }

}
