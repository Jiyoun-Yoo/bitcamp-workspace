// Queue 구현과 사용
//  - ArrayBlockingQueue 사용

package com.eomcs.corelib.ex06;

import java.util.concurrent.ArrayBlockingQueue;

public class Exam0110 {

  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    ArrayBlockingQueue queue = new ArrayBlockingQueue(10);
    queue.offer(s1); // aaa,
    queue.offer(s2); // aaa, bbb,
    queue.offer(s3); // aaa, bbb, ccc,
    print(queue);

    System.out.println("==> " + queue.poll()); // aaa
    System.out.println("==> " + queue.poll()); // bbb
    print(queue); // ccc,

    queue.offer(s4); // ccc, ddd,
    queue.offer(s5); // ccc, ddd, eee,
    print(queue);

    System.out.println("--------------------------");

    String value;

    while ((value = (String) queue.poll()) != null) {
      System.out.println(value);
    }
  }

  static void print(ArrayBlockingQueue queue) {
    Object[] arr = queue.toArray();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
}

// 큐 사용의 예:
//  - 인터넷 예약 처리할 때
//  - single-thread 기반 node 서버의 요청처리
//  - 마우스 또는 키보드 이벤트 처리(이벤트가 발생된 순서대로 처리)
