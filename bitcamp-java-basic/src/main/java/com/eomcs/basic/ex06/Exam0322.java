// 흐름 제어문 - break와 continue 활용

package com.eomcs.basic.ex06;

public class Exam0322 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    // 부터 100까지 카운트를 하는데 단 합은 50까지만 계산한다.

    // break 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50) // 50을 넘으면 합을 수행하지 않지만 100까지 계속 반복한다.
        continue;
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

    System.out.println("-----------------------------");

    // break 사용 후
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        break; // 즉시 반복문을 종료하고 나간다.
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

  }
}

// break는 반복문을 탈출하는 것
// continue는 조건문으로 가서 다음 반복을 실행하는 것
