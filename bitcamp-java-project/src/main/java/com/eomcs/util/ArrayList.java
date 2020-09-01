package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> {

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elementDate;
  private int size;

  public ArrayList() {
    elementDate = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if(initialCapacity < DEFAULT_CAPACITY) {
      elementDate = new Object[DEFAULT_CAPACITY];
    } else {
      elementDate = new Object[initialCapacity];
    }
  }

  public boolean add(E e) {
    if(size == elementDate.length) {
      grow();
    }
    elementDate[size++] = e;
    return true;
  }

  private void grow() {
    //System.out.println("오호라! 배열을 늘리자!");
    int newCapacity = elementDate.length + (elementDate.length >> 1);
    elementDate  = Arrays.copyOf(elementDate, newCapacity);
  }

  public void add(int index, E element) {
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

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return (E) elementDate[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementDate[index];
    elementDate[index] = element;
    return (E) old;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    Object old = elementDate[index];

    System.arraycopy(
        elementDate, // 복사 대상
        index + 1, // 복사할 항목의 시작 인덱스
        elementDate, // 목적지
        index, // 복사 목적지 인덱스
        this.size - (index + 1) // 복사할 항목의 개수
        );
    size--;
    elementDate[size] = null;
    return (E) old;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementDate, this.size);
    return arr;
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      // 파라미터로 받은 배열이 작을 때는 새 배열을 만들어 리턴
      return (E[]) Arrays.copyOf(this.elementDate, this.size, arr.getClass());
    }
    System.arraycopy(this.elementDate, 0, arr, 0, this.size);
    // 배열의 크기가 넉넉할 때는 받은 배열을 그대로 리턴
    return arr;
  }

}
