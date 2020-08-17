// 객체(의 주소) 목록을 다루는 클래스 - 컬렉션 클래스(collection class) 정의

package com.eomcs.corelib.ex03;

import java.util.ArrayList;
// Arraylist는 인스턴스 주소 목록을 배열로 관리한다.
// 특정 위치에 데이터를 저장하고 조회하거나 제거할 수 있다.

// 배열을 이용하여 컬렉션 클래스 만들기 : ArrayList
//  => 단점: 배열의 크기가 고정되기 때문에 배열을 초과하여 값을 넣으려면
//           더 큰 새 배열을 만들고, 기존 값을 복사해야 한다.
//           배열의 크기가 늘 때마다 가비지(garbage)가 생기는 문제가 있다.
//           기본 배열의 값을 복사하기 때문에 속도가 느린 문제도 있다.
public class Exam0110 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
 // 배열의 맨 끝에 새로운 값을 넣는다.
    list.add("aaa"); // aaa,
    list.add("bbb"); // aaa, bbb,
    list.add("ccc"); // aaa, bbb, ccc,
    list.add("ddd"); // aaa, bbb, ccc, ddd,

    print(list);

    // 특정 위치에 저장된 값을 제거한다.
    list.remove(2); // aaa, bbb, ddd,
    print(list);
    // ccc를 가리키는 레퍼런스의 주소를 잃어버렸다.
    // ccc라는 인스턴스는 가비지가 되었다.

    list.remove(0); // bbb, ddd,
    print(list);

    // 유효한 인덱스가 아니면 예외 발생시킨다!
    //list.remove(10); // 실행 오류!
    list.remove(4); // bbb, ddd,
    print(list);

    // 특정 위치를 지정하여 값을 넣는다.
    // 삽입할 인덱스가 배열의 크기를 가리킬 경우, 맨 끝에 추가한다.
    // 유효하지 않은 범위를 입력할 경우 IndexOutOfBoundsException 발생
    list.add(1, "xxx"); // bbb, xxx, ddd,
    list.add(1, "yyy"); // bbb, yyy, xxx, ddd
    list.add(0, "zzz"); // zzz, bbb, yyy, xxx, ddd
    list.add(5, "ttt"); // zzz, bbb, yyy, xxx, ddd

    print(list);

    list.set(1, "aaa"); // zzz, aaa, yyy, xxx, ddd

    print(list);

    list.add("ccc"); // zzz, aaa, yyy, xxx, ddd, ccc
    list.add("eee"); // zzz, aaa, yyy, xxx, ddd, ccc, eee

    print(list);
  }

  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println();
  }
}