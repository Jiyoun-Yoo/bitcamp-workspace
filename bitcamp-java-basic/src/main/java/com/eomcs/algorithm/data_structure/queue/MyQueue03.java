package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 01) Queue를 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 02) Queue에 값을 추가하는 offer(Object)를 정의한다.
// 03) Queue에서 값을 꺼내는 poll()를 정의한다.
public class MyQueue03 extends MyLinkedList{

  public boolean offer(Object e) {
    return this.add(e);
  }

  // 가장 처음의 것을 꺼내고 제거한다.
  // - 첫 번째 element를 제거하면 자연스레 두 번째 element가 첫 번째가 된다.
  public Object poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }

}
