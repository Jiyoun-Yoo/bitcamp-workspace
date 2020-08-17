package com.eomcs.corelib.ex04;

public class MyLL {

  Node first;
  Node last;
  int size;

  class Node {
    Object value;
    Node next;

    public Node() {}
    public Node(Object element) {
      this.value = element;
    }
  }

  public boolean add(Object e) {

    Node node = new Node(e);
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
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node cursor = this.first;
    for(int i = 1; i <= index ; i++) {
      cursor = cursor.next;
    }

    return cursor.value;
  }

  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size++;
    Node node = new Node(element);

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node cursor = this.first;
    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }

  public Object remove(int index, Object element) {
    if (index < 0 || index > this.size) {
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
    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }

    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null;

    if (cursor.next == null) {
      last = cursor;
    }

    return old;
  }

  public Object set(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException ("인덱스가 유효하지 않습니다.");
    }


  return Object;
  }



}






