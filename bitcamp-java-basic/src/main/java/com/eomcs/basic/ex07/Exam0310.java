// 메서드 : call by value

package com.eomcs.basic.ex07;

public class Exam0310 {

  static void swap(int a, int b) {
    System.out.printf("swap(): a = %d, b = %d\n", a, b); // swap 실행 전
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a = %d, b = %d\n", a, b); // swap 실행 후
  }

  public static void main(String[] args) {
    int a = 100;
    int b = 200;

    // swap()을 호출할 때 a 변수의값과 b 변수의 값을 넘긴다.
    //  => 그래서 "call by value"라 부른다.
    //  => 비록 swap()에서 a와 b라는 이름의 변수가 있지만,
    //     이 변수는 main()에 있는 변수와 다른 변수이다.
    swap(a, b);
    System.out.printf("main(): a = %d, b = %d\n", a, b);
    // main(): a = 100, b = 200 출력
    //  => swap 메서드를 호출하여 a, b를 변경했지만 로컬변수를 변경한 것!
    //     main 메서드의 a, b 값을 변경한 것이 아니다.
    //  => call by value로 호출한 경우에는 main 메서드의 값을 바꾸지 못한다.
  }
}

// call by value
//  => 아규먼트가 primitive data type인 경우,
//     메서드를 호출할 때 값을 넘긴다.
//  => 자바에서는 primitive data type에 대해서
//     메모리(변수) 주소를 넘기는 방법이 없다.