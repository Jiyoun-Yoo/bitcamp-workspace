package com.eomcs.algorithm.data_structure.array;

// 테스트1 - MyArrayListTest
//  01) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다.
//  02) 인스턴스를 추가하는 add() 메서드를 정의한다.
//  03) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의한다.
//  04) 인스턴스를 특정 위치에 삽입하는 add(int, Object) 메서드를 정의한다.
//  05) 특정 위치의 값을 항목을 인스턴스로 교체하는 set(int, Object) 메서드를 정의한다.
//  06) 특정 위치의 항목을 제거하는 remove(int) 메서드를 정의한다.

// 테스트2 - MyArrayListTest2
//  07) add()할 때 배열의 크기를 넘는 경우, 배열의 크기를 늘린다.
public class MyArrayList07 {
  static Object[] elementDate = new Object[5];
  static int size;

  static public boolean add(Object e) {
    if(size == elementDate.length) {
      grow();
    }
    elementDate[size++] = e;
    return true;
  }

  // 배열의 크기는 한 번 정해지면 바꿀 수 없다.
  // 새 배열을 만들고 기존의 배열에서 데이터를 복사한다. 그리고 새 배열의 주소를 복사해온다.
  // 기존의 배열을 가리키는 레퍼런스를 잃기 때문에 기존의 배열은 가비지가 된다.
  // 배열의 크기를 늘리는 grow() 메서드를 생성하고, add()메서드에서 호출한다.
  static private void grow() {
    System.out.println("오호라! 배열을 늘리자!");
    // 1) 배열의 크기를 늘릴때 보통 원래의 크기보다 1.5배로 늘린다.
    //    이 때 배열의 크기 늘릴 때 비트 연산(>> 1)을 사용했다.
    Object[] newArray = new Object[elementDate.length + (elementDate.length >> 1)];
    // 2) 기존 배열에서 데이터를 가져와서 새 배열에 저장한다.
    for(int i = 0; i < elementDate.length; i++) {
      newArray[i] = elementDate[i];
    }
    // 3) 기존의 레퍼런스에 새 배열의 레퍼런스를 저장한다.
    elementDate = newArray;
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
    for(int i = index; i < size -1; i++) {
      elementDate[i] = elementDate[i+1];
    }
    size--;
    return old;
  }

}
