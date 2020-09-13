// 흐름 제어문 - break와 continue 활용

package com.eomcs.basic.ex06;

public class Exam0321 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    // 1부터 100까지의 짝수의 합은?

    // continue 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if(count % 2 == 0) {
        sum += count;
      }
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

    System.out.println("-----------------------------");

    // continue 사용 후
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 1)
        continue; // 아래 문장 실행X
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

  }
}

// break는 반복문을 탈출하는 것
// continue는 조건문으로 가서 다음 반복을 실행하는 것
