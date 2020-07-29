package com.eomcs.basic.ex05.assignment;

// 과제
//  다음 int변수에 들어있는 값에서
//  각 자릿수의 10진수 값을 역순으로 출력하라.

// 실행 예)
//  값: 23459876

// 출력)
//  6
//  7
//  8
//  9
//  5
//  4
//  3
//  2

public class Test04_a {

  public static void main(String[] args) {
    int value = 23459876;
    
    // 코드를 완성하시오!
    
    // 나의 풀이2
    int no = 0;
    for (int i = 0; value > 0; i++) {
      no = value % 10;
      System.out.println(no);
      value /= 10;
    }
    
    
    /*
     * 나의 풀이1
    int a, b, c, d, e, f, g, h;
    
    a = value % 10;
    System.out.println(a);
    
    value /= 10;
    b = value % 10;
    System.out.println(b);
    
    value /= 10;
    c = value % 10;
    System.out.println(c);
    
    value /= 10;
    d = value % 10;
    System.out.println(d);
    
    value /= 10;
    e = value % 10;
    System.out.println(e);
    
    value /= 10;
    f = value % 10;
    System.out.println(f);
    
    value /= 10;
    g = value % 10;
    System.out.println(g);
    
    value /= 10;
    h = value % 10;
    System.out.println(h);
    */
    
    // 배운 점
    // 단순히 출력만 할 때는 굳이 변수를 선언하지 않아도 된다.
    }
}








