// 변수 사용 I

package com.eomcs.basic.ex04;

public class Exam0310 {
  public static void main(String[] args) {
    int age = 20; // 변수의 이름은 보통 의미를 담는 것으로 한다.
    
    System.out.println(age);
    
    age = 30;
    
    System.out.println(age);
    
   int no;
   
   // 메모리 확보 후 초기화하지 않은 변수는 사용할 수 없다.
   // System.out.println(no); 컴파일 오류
   
   int x;
   
   // x = no; 컴파일 오류
   
   // 변수를 선언하기 전에 사용할 수는 없다. (자바 스크립트는 가능!)
   // System.out.println(y); 컴파일 오류
   int y = 100;   
   
  }
}
