package com.eomcs.corelib.ex04;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
public class MyLinkedList03 {

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  Node first;

  // 값을 추가할 때는 마지막 노드에 연결한다.
  Node last;

  // 목록 크기를 보관한다.
  int size;

  static class Node {
    Object value;
    Node next;
  }

}