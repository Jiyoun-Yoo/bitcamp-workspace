// 로컬 변수 선언

package com.eomcs.basic.ex04;

public class Exam0800
{ // 클래스 블록   =>   클래스 정의

  static int x;

  public static void main(String[] args) // 메서드 선언
  { // 메서드 블록   =>   메서드 정의

    int a;

    int x;
    // 같은 메서드 블록에 소속된 로컬 변수가 아니라면
    // 같은 이름으로 변수를 선언할 수 있다.
    // 왜? 영역이 다르니까!

    // int a; // 컴파일 오류! => 문법 오류!
    // 같은 메서드 블록에 이름이 같은 변수를 중복 선언할 수 없다.

    // String a; // 컴파일 오류! => 데이터 타입에 상관없이 이름 중복 불가!

    { // 로컬 블록
      // int a; // 바깥 블록에 선언된 변수와 같은 이름을 가질 수 없다.
      int b;

      {
        // int b; // 바깥 블록에 선언된 변수와 같은 이름의 변수를 선언할 수 없다.
        // int a; // 컴파일 오류!
        int c;
        int d;
      }

      // c = 100; // 컴파일 오류!
      // 블록 안에 선언된 변수는 블록을 나가는 순간 자동 삭제된다.

      int c; // 이 변수는 위에서 선언한 하위 블록의 변수 c와 다르다.

      {
        int d; // 이전 블록에서 만든 d 변수는 이미 삭제되었기 때문에
               // 이 블록에서 같은 이름으로 변수를 만들 수 있다.
      }

      b = 100;
      c = 200;
      // d = 300; //컴파일 오류! (변수 d는 위의 블럭이 끝날 때 자동 삭제되었다.)
      a = 300;

    }

    int i;
    for (i = 0; i <10; i++) {
      System.out.println(i);
    }
    System.out.println(i); // i가 for문 밖에 선언되었기 때문에 접근 가능하다.

    for (int k = 0; k < 10; k++) {
      System.out.println(k);
    }
    // System.out.println(k); // k가 for문 안에 선언되었기 때문에 접근할 수 없다.

    int age = 20;
    int m;
    if (age > 19) {
      m = 200;
      int n = 300;
    }

    // System.out.println(m); // 컴파일 오류!
    // System.out.println(n); // 컴파일 오류!
    // 변수를 사용하여 for문의 조건을 지정했기 때문에 컴파일러가 확신할 수 없다.
  }
}