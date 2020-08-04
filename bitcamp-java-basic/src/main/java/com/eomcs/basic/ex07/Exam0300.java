// call by value  vs  call by reference

package com.eomcs.basic.ex07;

public class Exam0300 {

  static class Person {
    // 새로운 종류의 메모리를 설계한다.
    //  => 새로운 데이터 타입을 정의한다.
    //  => 클래스를 정의한다.
    String name; // null로 초기화
    int age; // 0으로 초기화
    boolean working; // false로 초기화
  }

  public static void main(String[] args) {
    int a = 200;

    m1(a); // call by value

    System.out.println(a);

    a = 300;

    m1(a);

    System.out.println(a);

    int[] arr = new int[3]; // arr은 배열의 주소를 담은 변수
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;

    // new 명령으로 생성하는 변수는 Heap이라는 영역에 만들어진다.
    // 위에서 생성한 배열은 이 영역에 생성된다.

    m2(arr); // call by reference

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);


    System.out.println("----------------");


    Person p;
    p = new Person();

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);

    m3(p); // call by reference

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);

  }

  static void m1(int a) {
    a = 100; // 로컬 변수
  } // 메서드 호출이 끝나면 로컬변수는 지워진다.

  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;
  }

  static void m3(Person p) {
    p.name = "홍길동";
    p.age = 20;
    p.working = true;
  }
}

// 시험지:
//  1. 다음 계산을 수행하라.
//     a 변수에 100을 넣어라.
//     b 변수에 200을 넣어라.
//     a와 b를 더해 그 결과를 출력하라.

