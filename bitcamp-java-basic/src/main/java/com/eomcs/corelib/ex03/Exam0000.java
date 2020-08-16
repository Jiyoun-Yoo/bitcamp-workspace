package com.eomcs.corelib.ex03;

public class Exam0000 {
  private Object[] elementDate = new Object[5];
  private int size;

  boolean add(Object element) {
    if (elementDate.length == size) {
      grow();
    }
    elementDate[size++] = element;
    return true;
  }

  public Object add(int index, Object element) {
    if (elementDate.length == size) {
      grow();
    }
    Object old = elementDate[index];
    for (int i = size; i > index; i--) {
      elementDate[i] = elementDate[i-1];
    }
    elementDate[index] = element;
    return old;
  }

  private void grow() {
    Object[] newArray = new Object[elementDate.length + (elementDate.length >> 1)];
    for(int i = 0; i < elementDate.length; i++) {
      newArray[i] = elementDate[i];
    }
    elementDate = newArray;
  }

  public Object get(int index) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return elementDate[index];
  }

  public Object set(int index, Object element) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementDate[index];
    elementDate[index] = element;
    return old;
  }

  public Object remove(int index) {
    Object old = elementDate[index];
    for (int i = index; i < size -1; i++) {
      elementDate[i] = elementDate[i+1];
    }
    size--;
    elementDate[size] = null;
    return old;
  }

  public int size() {
    return this.size;
  }

}
