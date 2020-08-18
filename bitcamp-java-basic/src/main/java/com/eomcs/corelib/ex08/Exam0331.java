// Hashtable과 Iterator

package com.eomcs.corelib.ex08;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Exam0331 {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("윤봉길", 25);

    Hashtable table = new Hashtable();
    table.put("s01", v1);
    table.put("s02", v2);
    table.put("s03", v3);
    table.put("s04", v4);
    table.put("s05", v5);

    Set keys = table.keySet();
    Iterator iterator = keys.iterator();
    // Iterator 객체를 생성할 때,
    // 현재 목록 객체(keys)를 바탕으로 생성한다.
    // Iterator는 keys의 목록을 가지고 있다.

    // 따라서 다음과 같이 Iterator를 생성한 후에 목록의 값을 변경하면,
    // 기존 목록에서 뽑은 Iterator는 무효한 객체가 된다.
    table.remove("s01");
    table.remove("s02");
    table.remove("s03");

    // 무효한 Iterator를 사용하면 실행오류가 발생할 것이다.
    // ConcurrentModificationException
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}