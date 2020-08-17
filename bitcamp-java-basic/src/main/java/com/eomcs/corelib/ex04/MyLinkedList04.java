package com.eomcs.corelib.ex04;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
public class MyLinkedList04 {

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

    // 기존에 node가 하나도 없다면
    // 추가하려는 node를 first에 담아야 한다.
    if (first == null) {
      first = node;
    } else {
      // 기존에 이미 node가 있다면
      // last가 새로운 node를 가리키도록 한다.
      last.next = node;
    }
    // 그리고 last에 새 node의 레퍼런스를 담는다.
    last = node;

    size++;
    return true;
  }

}
