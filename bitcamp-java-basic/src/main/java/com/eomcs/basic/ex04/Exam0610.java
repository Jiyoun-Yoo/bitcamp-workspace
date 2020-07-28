// 상수 - 값을 바꿀 수 없는 변수

package com.eomcs.basic.ex04;

public class Exam0610 {
  public static void main(String[] args) {
    // 변수  - 언제든 값을 바꿀 수 있다.
    int a;
    a = 100;
    a = 200;
    a = 300;
    
    // 변수의 값을 한 번 설정하면 바꾸지 못하게 막는 문법
    final int b; // final을 붙인다.
    b = 100;
    // b = 200; // 컴파일 오류! 문법이 맞지 않아 컴파일 할 수 없는 것!
    
    // 상수 변수는 보통 선언과 동시에 값을 저장한다.
    final int c = 100;
    // c = 200; // 컴파일 오류!
    
    // 변수와 상수를 구분하기 위해서 상수의 이름은 대문자로 이름을 짓는다.
    final int LENGTH = 100;
    
    // 상수의 이름을 대문자로 작성할 때 단어 사이에 _를 삽입한다.
    int firstUserName; // 변수
    final int FIRST_USER_NAME; // 상수
    
    // int만 상수로 만들 수 있는 것은 아니다.
    final float PI = 3.141592f;
    final float MILE = 0.621371f;
        
  }
}
