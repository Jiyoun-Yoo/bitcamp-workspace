package com.eomcs.util;

import java.util.NoSuchElementException;

// 이 추상 클래스는 List 규칙에 따라 작성한다.
//  => 단 일부 메서드는 이 클래스에서 구현하지만,
//     나머지 메서드는 서브 클래스에서 구현하도록 남겨둔다.
public abstract class AbstractList<E> implements List<E> {

  protected int size;

  @Override
  public int size() {
    return this.size;
  }

  // 컬렉션에서 목록 조회를 담당할 Iterator 구현체를 리턴한다.
  @Override
  public Iterator<E> iterator() {
    class ListIterator implements Iterator<E> {
      int cursor;

      @Override
      public boolean hasNext() {

        return cursor < AbstractList.this.size();
      }

      @Override
      public E next() {
        if(cursor == /*AbstractList.this.*/size()) {
          throw new NoSuchElementException();
        }
        return /*AbstractList.this.*/get(cursor++);
      }
    }
    return new ListIterator();
  }


}
