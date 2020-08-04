// Stack과 Heap 메모리 영역

package com.eomcs.basic.ex07;

public class Exam0415 {

  public static void main(String[] args) throws Exception {

    int result = 1;
    int n = 5;

    for (int i = 1; i <= 5; i++) {
      result *= i;
    }

    System.out.println(result);

    System.out.println("----------------");

    result = factorial(5);

    // result = 5 * factorial(4)
    // result = 5 * 4 * factorial(3)
    // result = 5 * 4 * 3 * factorial(2)
    // result = 5 * 4 * 3 * 2 * factorial(1)
    // result = 5 * 4 * 3 * 2 * 1

    System.out.println(result);
  }

  // 재귀 호출 메서드
  //  - 자기 자신을 호출한다고 생각하지 말고, 다른 메서드를 호출한다고 생각하면 쉽다.
  //  - 메서드는 하나지만, 메서드가 호출될 때마다 stack에 새로운 메모리가 할당된다.
  static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    // 위의 조건을 달아주지 않으면 StackOverflowError
    //  - 개발자가 개입할 수 없다. 적절한 조치를 취할 수 없다. 시스템을 멈춰야 한다.
    return n * factorial(n - 1);
  }

}
