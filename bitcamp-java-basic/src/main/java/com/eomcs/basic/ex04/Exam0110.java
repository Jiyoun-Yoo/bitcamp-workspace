// 변수 선언
//  - 데이터를 저장할 메모리를 확보하는 명령

package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    
    // 변수 선언 문법
    //  - 데이터타입 변수
    
    int i;  // 메모리를 확보하고 i라는 이름을 붙임
    
    // 문법
    //  - int : 값을 저장할 메모리의 종류. '데이터 타입(data type; 자료형)'이라 부른다.
    //  - i : 메모리를 가리키는 이름. '변수(variables)'라 부른다.
    //
    // 의미
    //  - 정수 값을 담을 메모리를 준비하고 그 메모리의 이름을 i 라고 하자!
    
    int i2;
    int i3;
    
    int x, y, z;
    // 4byte 메모리가 6개 만들어짐
    
    // 변수에 값 할당하기 (=는 할당연산자 assignment operator)
    i = 100;
    x = i;
    y = i * x;
    
    byte b1;
    byte b2;
    
    b1 = 10; // [00001010]
    b2 = 12; // [00001100]
    b1 = b2; // b1 = [00001100]
    
    // 작은 값을 큰 값에 넣는 것은 OK 
    i = b1; // [00000000_00000000_00000000_00001100] 
    
    // 큰 값을 작은 값에 넣는 것은 X
    // b2 = i;
    // b2 = (byte)i; 값이 손실되는 것을 감안하고 담을 수는 있다
    
    // 변수를 선언하는 동시에 값을 담을 수도 있다. (initialize)
    int a = 100;
    int b = 200;
    
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10; // 00001010
    xx = 12; // 00001100
    xx = 78; // 01001110
    
  }
}

// ## 변수의 이름
//  - 보통 소문자로 시작한다.
//  - 대소문자를 구분한다.
//  - 여러 단어로 구성된 경우 두 번째 단어의 시작 알파벳은 대문자로 한다.
//  - 예) firstName, createdDate, userId
//  - 상수인 경우 보통 모두 대문자로 이름을 짓는다. 단어와 단어 사이는 _를 사용한다.
//  - 예) USER_TYPE, USER_MANAGER

// ## 데이터 타입
//  - primitive date type (자바 기본 데이터 타입)
//    - 정수: int(4), long(8), byte(1), short(2)
//    - 부동소수점: float(4), double(8)
//    - 문자: char(2)
//    - 논리: boolean(4 or 1)
