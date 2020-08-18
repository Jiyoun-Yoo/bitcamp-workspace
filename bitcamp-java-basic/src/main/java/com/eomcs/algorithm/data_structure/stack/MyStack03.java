package com.eomcs.algorithm.data_structure.stack;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 01) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 02) Stack에 값을 추가하는 push() 메서드를 정의한다.
// 03) Stack에서 제일 마지막에 추가한 값을 꺼내는 pop() 메서드를 정의한다.
public class MyStack03 extends MyLinkedList {

  public Object push(Object item) {
    add(item);
    return item;
  }

  // 제일 마지막에 추가한 값을 꺼내고 제거한다.
  public Object pop() {
    if (size() == 0) {
      // JAVA API의 문서대로 예외 처리!
      throw new EmptyStackException();
    }
    // 가장 마지막 값의 인덱스는 (size - 1)
    return remove(size() - 1);
  }

}
