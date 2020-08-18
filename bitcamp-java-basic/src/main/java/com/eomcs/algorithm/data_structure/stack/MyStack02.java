package com.eomcs.algorithm.data_structure.stack;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 01) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 02) Stack에 값을 추가하는 push() 메서드를 정의한다.
public class MyStack02 extends MyLinkedList {

  public Object push(Object item) {
    // 맨 끝에 Object를 넣는다.
    add(item);
    return item;
  }

}
