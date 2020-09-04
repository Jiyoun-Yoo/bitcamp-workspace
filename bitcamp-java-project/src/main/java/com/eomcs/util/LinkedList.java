package com.eomcs.util;

import java.lang.reflect.Array;

public class LinkedList<E> extends AbstractList<E> {

  private Node<E> first;
  private Node<E> last;

  static class Node<E> {
    E value;
    Node<E> next;

    public Node() {}

    public Node(E value) {
      this.value = value;
    }
  }

  @Override
  public boolean add(E e) {
    Node<E> node = new Node<>();
    node.value = e;

    if(first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;

    size++;
    return true;
  }

  @Override
  public E get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    return cursor.value;
  }

  @Override
  public void add(int index, E element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> node = new Node<>(element);

    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }

  @Override
  public E remove(int index) {
    if(index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    if(index == 0) {
      Node<E> old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    Node<E> old = cursor.next;

    cursor.next = old.next;

    old.next = null;

    if(cursor.next == null) {
      last = cursor;
    }

    return old.value;
  }

  @Override
  public E set(int index, E element) {
    if(index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    E old = cursor.value;
    cursor.value = element;

    return old;
  }

  @Override
  public Object[] toArray() {
    Object[] arr = new Object[this.size];

    int i = 0;
    Node<E> cursor = first;
    // while문의 조건에 따라
    // cursor는 first부터 last까지 이동한다.
    while (cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }

    return arr;
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size()) {
      // 다음과 같이 배열의 타입을 엄격하게 형변환해도 된다.
      //Class<E[]> arrayClassInfo = arr.getClass();
      //Class<E> arrayItemClassInfo = arrayClassInfo.getComponentType();

      // 그러나 조회용으로 사용할 것이라면
      // 굳이 리턴 값에 대해 제네릭 형변환을 엄격히 할 필요가 없다.
      Class<?> arrayClassInfo = arr.getClass();
      Class<?> arrayItemClassInfo = arrayClassInfo.getComponentType();
      arr = (E[]) Array.newInstance(arrayItemClassInfo, this.size());
      // 실무에서는 위 3줄의 코드를 한 줄로 작성한다.
      // 간략하게 표현하면 코드를 읽기 쉽다.
      // arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), this.size());
    }

    Object[] originArr = this.toArray();
    for(int i = 0; i < this.size(); i++) {
      arr[i] = (E) originArr[i];
      // Object 배열 안에 실제 저장된 데이터는 E 타입이므로, 형변환 해준다.
    }
    return arr;
  }

}
