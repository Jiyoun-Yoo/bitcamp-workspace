// 콘솔로 출력하기 I

package com.eomcs.basic.ex99;

public class Exam0110 {
  public static void main(String[] args) {
    // 값 출력하기

    // println() = 출력 + 줄바꿈
    System.out.println(20); // int 리터럴
    System.out.println(3.14f); // float 리터럴
    System.out.println("Hello"); // string 리터럴
    System.out.println('Y'); // char 리터럴
    System.out.println(true); // boolean 리터럴

    // 값이 주지 않으면 줄바꿈만 수행한다.
    System.out.println();

    // print() 는 출력만 한다. 줄바꿈 없다.
    System.out.print(20);
    System.out.print(3.14f);
    System.out.print("Hello");
    System.out.print('Y');
    System.out.print(true);

    // 이스케이프 문자를 통해 줄바꿈을 수행한다.
    System.out.print('\n');

    System.out.print("OK!\n"); // ==> println("Ok!")
    System.out.print("Hi!\n"); // ==> println("Hi!");
  }
}