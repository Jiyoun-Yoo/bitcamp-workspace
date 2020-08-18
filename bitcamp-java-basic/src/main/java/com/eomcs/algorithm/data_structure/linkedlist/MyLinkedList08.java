package com.eomcs.algorithm.data_structure.linkedlist;

// 01) LinkedList 클래스 정의
// 02) 값을 담을 노드 클래스를 설계한다.
// 03) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//     목록 크기를 저장할 필드를 추가한다.
// 04) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 05) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 06) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
//     - Node의 생성자를 추가한다.
// 07) 목록에서 특정 인덱스의 값을 제거하는 remove(int) 메서드를 정의한다.
// 08) 목록에서 특정 인덱스의 값을 바꾸는 set(int, Object) 메서드를 정의한다.
public class MyLinkedList08 {

  Node first;
  Node last;
  int size;

  static class Node {
    Object value;
    Node next;

    public Node() {}

    public Node(Object value) {
      this.value = value;
    }

  }

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;

    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;

    size++;
    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node node = new Node(element);

    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }

  public Object remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    Node old = cursor.next;

    cursor.next = old.next;

    old.next = null;

    if (cursor.next == null) {
      last = cursor;
    }

    System.out.println(old);
    return old.value;
  }

  // get() 메서드를 활용한다.
  public Object set(int index, Object element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    // index가 가리키는 node를 찾는다.
    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      // 현재 가리키고 있는 node에 담겨있는 next의 주소를
      // cursor에 넣어 cursor를 이동한다.
      cursor = cursor.next;
    }

    // 바꾸려는 객체에 담겨 있는 value를 old에 저장한다.
    // 그리고, 그 객체의 value를 old에 담는다.
    Object old = cursor.value;
    cursor.value = element;

    return old;
  }

}