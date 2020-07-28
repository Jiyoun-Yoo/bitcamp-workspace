// 변수의 종류

package com.eomcs.basic.ex04;

public class Exam0710 {
  
  // 클래스 블럭에 바로 선언하는 변수
  
  int a; // 논스태틱(non-static) 필드 = 인스턴스 필드(field, 변수)
  
  static int b; // 스태틱 필드 = 클래스 필드
  
  public static void main(String[] args/* 로컬 변수 = 파라미터*/) {
    int c; // 로컬 변수
  }
}

// 인스턴스 변수(instance variable)
//  - new 명령을 사용하여 인스턴스를 생성할 때 준비되는 변수

// 클래스 변수(class variable = static variable)
//  - 클래스가 로딩될 때 준비되는 변수

// 로컬 변수(local variable)
//  - 블록을 실행할 때 준비되는 변수

// 파라미터(parameter)
//  - 메서드의 아규먼트를 받는 로컬변수
//    예) 위의 코드에서 main()의 args 로컬 변수