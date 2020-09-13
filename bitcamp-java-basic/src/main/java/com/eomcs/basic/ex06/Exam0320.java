// 흐름 제어문 - break와 continue 활용

package com.eomcs.basic.ex06;

public class Exam0320 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    // 1부터 100까지의 합은?
    while (count < 100) {
      //count ++;
      //sum += count;
      sum += ++count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}

// break는 반복문을 탈출하는 것
// continue는 조건문으로 가서 다음 반복을 실행하는 것
