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
//  08) add(int, Object)로 임의의 위치로 삽입할 때
//      - 배열의 크기가 작으면 크기를 늘린다.
//      - 인덱스가 유효하지 않으면 오류를 발생시킨다.
//  09) get(int)으로 유효하지 않은 인덱스의 값을 꺼낼 때 예외를 발생시킨다.
//  10) remove()를 수행한 후 맨 끝에 남아 있는 주소를 null로 설정하여
//      인스턴스의 레퍼런스 카운트를 한 개 줄인다.
//  11) set()을 호출할 때 인덱스가 유효하지 않으면 예외를 발생시킨다.

// 테스트2 - MyArrayListTest3
//  12) 여러 개의 목록을 동시에 관리할 수 있도록
//      MyArrayList에 선언된 레퍼런스 배열을 스태틱 대신 인스턴스로 전환한다.
//      - 개별적으로 관리해야 할 데이터는 인스턴수 변수를 사용해야 한다.
//  13) 캡슐화를 적용하여 공개할 멤버와 공개하지 말아야 할 멤버를 구분한다.
public class MyArrayList13 {
  // private를 붙여 접근을 제한한다.
  private Object[] elementDate = new Object[5];
  private int size;

  public boolean add(Object e) {
    if(size == elementDate.length) {
      grow();
    }
    elementDate[size++] = e;
    return true;
  }

  private void grow() {
    System.out.println("오호라! 배열을 늘리자!");
    Object[] newArray = new Object[elementDate.length + (elementDate.length >> 1)];
    for(int i = 0; i < elementDate.length; i++) {
      newArray[i] = elementDate[i];
    }
    elementDate = newArray;
  }

  public void add(int index, Object element) {
    if(size == elementDate.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    for(int i = size; i > index ; i--) {
      elementDate[i] = elementDate[i-1];
    }
    elementDate[index] = element;
    size++;
  }

  public Object get(int index) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return elementDate[index];
  }

  public Object set(int index, Object element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementDate[index];
    elementDate[index] = element;
    return old;
  }

  public Object remove(int index) {
    Object old = elementDate[index];
    for(int i = index; i < size -1; i++) {
      elementDate[i] = elementDate[i+1];
    }
    size--;
    elementDate[size] = null;
    return old;
  }

  // private으로 접근을 제한한 size에 접근할 수 있는 메서드를 만든다.
  public int size() {
    return this.size;
  }

}
