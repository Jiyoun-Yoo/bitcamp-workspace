package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
//    - Node의 생성자를 추가한다.
// 7) 목록에서 특정 인덱스의 값을 제거하는 remove(int) 메서드를 정의한다.
public class MyLinkedList07 {

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
    // 인덱스의 유효성을 검증한다.
    // 데이터가 실제로 들어있는 인덱스인지 검사한다.
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    // 첫 번째 node를 삭제하려는 경우
    // first에 그 다음 객체를 저장하면 된다.
    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.
      return old.value;
    }

    // 삭제하려는 인덱스의 바로 전의 node를 찾는다.
    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    // 삭제하려는 객체를 old에 담는다.
    Node old = cursor.next;

    // 삭제하려는 항목의 next가 가리키는 next의 주소를 cursor.next에 둔다.
    cursor.next = old.next;

    // 삭제하려는 객체를 가비지로 만든다.
    // 가비지가 다른 인스턴스를 가리키지 않게 한다.
    old.next = null;

    // 마지막 node를 삭제한 경우
    // last에 마지막 바로 전의 객체(새로 마지막이 된 객체)를 저장하면 된다.
    if (cursor.next == null) {
      last = cursor;
    }

    return old.value;
  }

}