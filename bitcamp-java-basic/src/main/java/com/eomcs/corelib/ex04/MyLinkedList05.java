package com.eomcs.corelib.ex04;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
public class MyLinkedList05 {

  Node first;
  Node last;
  int size;

  static class Node {
    Object value;
    Node next;
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
    // 인덱스의 유효성을 검사한다.
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    // 인덱스가 가리키는 node를 찾는다.
    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      // 현재 가리키고 있는 node에 담겨있는 next의 주소를
      // cursor에 넣어 cursor를 이동한다.
      cursor = cursor.next;
    }

    return cursor.value;
  }

}
