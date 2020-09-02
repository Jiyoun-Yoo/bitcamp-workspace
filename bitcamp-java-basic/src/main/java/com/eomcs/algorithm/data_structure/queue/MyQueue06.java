package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 01) Queue를 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 02) Queue에 값을 추가하는 offer(Object)를 정의한다.
// 03) Queue에서 값을 꺼내는 poll()를 정의한다.
// 04) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.

// 테스트2: MyQueueTest2
// 05) Queue.clone() 오버라이딩 : deep copy

// 테스트3: MyQueueTest3
// 06) 제네릭 적용
public class MyQueue06<E> extends MyLinkedList<E> implements Cloneable {

  public boolean offer(E e) {
    return this.add(e);
  }

  public E poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }

  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public MyQueue06<E> clone() throws CloneNotSupportedException {
    MyQueue06<E> newQueue = new MyQueue06();
    Object[] values = this.toArray();

    for(Object value : values) {
      newQueue.offer((E) value);
    }
    return newQueue;
  }

}
