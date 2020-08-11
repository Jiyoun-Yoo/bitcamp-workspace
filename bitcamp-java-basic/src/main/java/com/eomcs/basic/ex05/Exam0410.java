// 비트 이동 연산자 : >>, >>>, <<

package com.eomcs.basic.ex05;

public class Exam0410 {
  public static void main(String[] args) {
    // << 비트 이동 연산자 사용법
    //  - 왼쪽으로 비트를 이동시킨다.
    //  - 오른 쪽 빈자리는 0으로 채운다.
    //  - 왼쪽 경계를 넘어간 비트는 자른다.
    //
    int i = 1;
    //     00000000 00000000 00000000 00000001 = 1

    System.out.println(i << 1);
    //   0|00000000 00000000 00000000 0000001x
    //     00000000 00000000 00000000 00000010 = 2

    System.out.println(i << 2);
    //  00|00000000 00000000 00000000 000001xx
    //     00000000 00000000 00000000 00000100 = 4

    System.out.println(i << 3);
    // 000|00000000 00000000 00000000 00001xxx
    //     00000000 00000000 00000000 00001000 = 8

    System.out.println(i << 4);
    //0000|00000000 00000000 00000000 0001xxxx
    //     00000000 00000000 00000000 00010000 = 16

    i = 11; // 00000000 00000000 00000000 00001011
    System.out.println(i << 1); // 0|00000000 00000000 00000000 00010110 => 22
    System.out.println(i << 2); // 00|00000000 00000000 00000000 00101100 => 44
    System.out.println(i << 3); // 000|00000000 00000000 00000000 01011000 => 88

    // << 왼쪽 이동
    //  - 1비트 이동은 곱하기 2 한 것과 같은 효과를 준다.
    //  - 값을 배수로 증가시킬 때 곱하기 연산을 하는 것 보다
    //    왼쪽 비트 이동 연산을 하는 것이 빠르기 때문에
    //    실무에서는 이 비트 이동 연산을 자주 사용한다.
    //  - 비트 이동 => '2**이동비트'를 곱한 것 같은 결과를 만든다.
    //  - 나누기 하는 것은 부동소수점이 발생할 수 있지만, 비트 이동을 하면 걱정할 필요 X
    //    2의 제곱수로 나눌 경우에는 비트 이동을 활용하면 좋다.
    //
  }
}