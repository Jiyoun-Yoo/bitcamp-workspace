// 반복문 : while (조건) 문장;

package com.eomcs.basic.ex06;

public class Exam0300 {
  public static void main(String[] args) {

    // while (true) System.out.println("안녕!"); // 무한루프
    // 위와 같이 한 줄로 while문을 작성할 경우 보기 불편하다.

    // while (true); // 빈 문장을 계속 실행하는 무한루프

    int count = 1;
    // '안녕'을 10번 출력하기
    while (count <= 10) {
      System.out.println("안녕!");
      count++;
    }

    System.out.println("-----------------------------");

    // 아래과 같이 count값을 증가시킬 수도 있다.
    count = 0;
    while (count++ < 10) {
      System.out.println(count);
      // 출력문을 만날 때, count는 조건문에서의 값보다 1이 증가된 상태!
    }

    System.out.println("-----------------------------");

    // 1부터 100까지의 합계 구하기
    count = 0;
    int sum = 0;
    while (count++ < 100 ) {
      sum = sum + count;
    }
    // count를 증가하는 방법은 다양하게 변경 가능!
    // 조건문에서 count를 증가시키지 않고, sum = sum + ++count;로 해도 출력 결과는 동일!
    System.out.println(sum);

    System.out.println("-----------------------------");

    // 1에서 20까지의 짝수만 출력하기
    count = 0;
    while (count++ < 20) {
      if (count % 2 != 0) // count & 1  ==>  맨 오른쪽의 비트가 1인지 확인
        continue; // 다음의 문장은 실행하지 않고, 즉시 조건문으로 실행을 이동한다.
      System.out.println(count);
    }

    System.out.println("-----------------------------");

    // 중간에 반복문을 멈추는 방법
    count = 0;
    while (count++ < 20) {
      if (count > 5)
        break; // 다음의 문장은 실행하지 않고, 즉시 현재 소속된 반복문을 멈춘다.
      System.out.println(count);
    }

    System.out.println("-----------------------------");

    // 구구단
    int i = 2;
    int j = 1;
    while (i <= 9) { // nested
      j = 1; // 새로운 단에서 j는 1부터 시작할 수 있도록 초기화!
      while (j <= 9) {
      System.out.printf("%d x %d = %d\n",i , j, i * j);
      j++;
      }
      i++;
    }

    System.out.println("-----------------------------");

    // 구구단에서, 5*5까지만 출력하고싶다면?
    i = 2;
    j = 1;
    loop: {
      while (i <= 9) {
        j = 1;
        while (j <= 9) {
          System.out.printf("%d x %d = %d\n",i , j, i * j);
          if (i == 5 && j == 5)
            break loop; // break 다음에 라벨을 주면, 그 라벨 전체 나간다.
          j++;
        }
        i++;
      }
      System.out.println("메롱!"); // break로 loop를 빠져나가기 때문에 출력 X
    }
    System.out.println("---종료!---");

    System.out.println("-----------------------------");

    i = 2;
    j = 1;
    loop:
      while (i <= 9) {
        j = 1;
        while (j <= 9) {
          System.out.printf("%d x %d = %d\n",i , j, i * j);
          if (i == 5 && j == 5)
            continue loop;
          // continue는 소속된 반복문의 조건검사 부분으로 이동!
          // 라벨을 적어주지 않으면 5*5가 계속 출력되는 무한루프!
          j++;
        }
        i++;
        System.out.println("메롱!"); // 출력 X
      }
    System.out.println("---종료!---");

    System.out.println("-----------------------------");

    i = 0;
    do {
      System.out.println(i);
      i++;
    } while(i < 10);
  }
}
