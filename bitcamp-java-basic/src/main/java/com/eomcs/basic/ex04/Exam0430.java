// 문자 변수 & 논리 변수

package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    // 문자 변수
    char c;

    c = 0;
    c = 65535;
    // c = -1; 음수를 저장할 수 없다.
    // c = 65536;

    c = 65;
    c = 0x41;
    System.out.println(c); // 헐

    short s = 65;
    System.out.println(s); // 65

    // 똑같은 65를 저장하는 메모리라 하더라도
    // 변수 타입에 따라 출력하는 값이 다르다.

    c = 0x42;
    System.out.println(c);

    c = 0b01000011;
    System.out.println(c);

    c = '헐'; // '' 연산자는 문자의 2바이트 유니코드 값을 리턴한다.
    System.out.println(c); // 헐

    int i = '헐'; // 유니코드 값을 10진수로 출력한다.
    System.out.println(i); // 54736

    for (int x = 65; x < 80; x++) {
      System.out.println(x); // 65~79까지 출력
    }

    for (int x = 65; x < 80; x++) {
      System.out.println((char)x); // A~O까지 출력
    }

    // 논리 변수
    boolean b1, b2;
    b1 = true;
    b2 = false;

    System.out.println(b1);
    System.out.println(b2);

    // 논리 값은 정수로 다룰 수 없다.
    //  i = b1;
    //  i = b2;
    //  b1 = 1;

    byte b; // 1바이트 정수 값을 담을 메모리를 확보하고 그 메모리의 값을 b라고 한다.
    b = 12; // b라는 이름의 메모리에 12를 저장하라
    b = 38; // b라는 이름의 메모리에 38을 저장하라

    System.out.println(b); // b메모리에 저장된 값을 출력하라
  }
}