// 문자 변수 - UCS-2 코드 확인하
package com.eomcs.basic.ex04;

public class Exam0434 {
  public static void main(String[] args) {
    
    // 자바는 문자를 저장할 대 UCS-2에 정의된 정수 값을 저장한다.
    
    // 영어 대문자의 문자 코드 저장
    int a = 0x41;
    
    // 코드 값을 1씩 증가시키면서 문자를 출력해보자!
    for (int i = 0; i < 26; i++) {
      // 정수를 그냥 출력하면 10진수를 출력한다.
      // 정수가 문자 코드임을 알려줘야만 println()은 해당 코드의 문자를 출력한다.
      // 문법
      //  (char) 정수
      
      System.out.println((char)(a + i));
      
    }
  }

}
