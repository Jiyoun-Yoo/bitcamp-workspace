// 흐름 제어문 - 조건문 if
//  - 명령어는 위에서 아래로 흐른다.
//  - 조건을 만들어 그 흐름을 제어할 수 있다.

package com.eomcs.basic.ex06;

public class Exam0100 {
  public static void main(String[] args) {

    // if 조건문
    //  - 문법1
    //      if (조건) 문장1;
    //    => 조건이 참일 때 문장1을 수행한다.
    //  - 문법2
    //      if (조) 문장1; else 문장2;
    //    => 조건이 참일 때 문장1을 수행하고, 거짓이면 문장2를 수행한다.

    int age1 = 19;

    // if (조건) 문장
    if (age1 >= 19) // 문장을 다른 줄에 놓는 경우, if문의 조건 다음에 ;를 붙이지 않는다.
      // if문의 조건은 다음 ;을 만나기 전까지 유효하다.
      // 조건문 안에 여러 문장을 실행하고 싶다면 {}로 묶으면 된다.
      System.out.println("성년!"); // if문의 범위는 여기까지!
      System.out.println("안녕!"); // 이 문장은 들여쓰기가 되어있지만, if문에 속하지 않는다.

    System.out.println("-----------------------------");

    int gender1 = 1;

    if (gender1 != 2) { // 'gender가 2가 아니라면'으로 해석
      // 구글에서는 조건문 안에 한 문장을 넣더라도 {}로 묶는 것을 권한다.
      System.out.println("여성");
    }

    System.out.println("-----------------------------");

    int age2 = 65;

    // if의 조건이 상호배타적인 경우,
    // 두 개의 if 문을 사용한다.
    if (age2 >= 19)
      System.out.println("성인입니다.");

    if (age2 >= 65)
      System.out.println("노인연금 수령 대상자입니다.");

    System.out.println("-----------------------------");

    int gender2 = 2;

    // if의 조건이 배타적이지 않은 경우,
    //  - if-else문을 사용한다.
    //  - if-else는 한 문장이다. {}를 적지 않아도 된다.
    //  - else문은 항상 if문에 종속되었기 때문에, 독립적으로 사용할 수 없다.
    if (gender2 == 1) {
      System.out.println("여성!");
      System.out.println("-----");
    } else {
      System.out.println("남성!");
      System.out.println("-----");
    }

    System.out.println("-----------------------------");

    int age3 = 17;

    // ***코딩테스트***
    if (age3 >= 19)
      if (age3 >= 65)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");
    // 위의 코드를 실행할 경우 아무것도 출력되지 않는다.

    // else문은 자신과 가장 가까운 if문에 소속된다.
    // 위의 경우 else문 바깥의 if문에 연결된 것이 아니라 안쪽의 if문에 연결되어 있다.
    // 따라서 바깥의 if문 조건이 false이기 때문에 else문은 아예 실행되지 않는다.

    System.out.println("-----------------------------");

    int age4 = 67;

    if (age4 < 8)
      System.out.println("아동!");
    else
      if (age4 < 14)
        System.out.println("어린이!");
      else
        if(age4 < 19)
          System.out.println("청소년!");
        else
          if (age4 < 65)
            System.out.println("성인!");
          else
            System.out.println("노인!");

    System.out.println("-----------------------------");

    age4 = 16;

    // 위의 코드는 가독성이 떨어지기 때문에
    // 코드 관리의 명확성을 위해 편의상 else문 안의 if를 옆으로 붙여서 쓴다.
    // 자바는 else if라는 문법이 따로 존재하지 않는다!!!
    if (age4 < 8)
      System.out.println("아동!");
    else if (age4 < 14)
      System.out.println("어린이!");
    else if(age4 < 19)
      System.out.println("청소년!");
    else if (age4 < 65)
      System.out.println("성인!");
    else
      System.out.println("노인!");

    System.out.println("-----------------------------");

    age4 = 22;

    if (age4 < 8) {
      System.out.println("아동!");
    } else if (age4 < 14) {
      System.out.println("어린이!");
    } else if(age4 < 19) {
      System.out.println("청소년!");
    } else if (age4 < 65) {
      System.out.println("성인!");
    } else {
      System.out.println("노인!");
    }

  }
}