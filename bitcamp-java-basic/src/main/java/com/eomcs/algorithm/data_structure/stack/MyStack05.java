package com.eomcs.algorithm.data_structure.stack;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 01) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 02) Stack에 값을 추가하는 push() 메서드를 정의한다.
// 03) Stack에서 제일 마지막에 추가한 값을 꺼내는 pop() 메서드를 정의한다.
// 04) Stack에서 제일 마지막에 입력한 값을 조회하는 peek() 메서드를 정의한다.
// 05) Stack이 비어있는지 알려주는 empty()를 정의한다.
public class MyStack05 extends MyLinkedList {

  public Object push(Object item) {
    add(item);
    return item;
  }

  public Object pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public Object peek() {
    if(size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() -1);
  }

  public boolean empty() {
    return this.size() == 0;
    // Stack이 비어있으면 true를 리턴
  }

}
