package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 01) Queue를 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 02) Queue에 값을 추가하는 offer(Object)를 정의한다.
public class MyQueue02 extends MyLinkedList{

  public boolean offer(Object e) {
    // MyLinkedList의 add()를 호출한다.
    // - 인스턴스 메서드를 호출할 때는 그 주소를 반드시 알려줘야 하지만,
    //   this의 경우에는 생략할 수도 있다.
    return this.add(e);
  }

}
