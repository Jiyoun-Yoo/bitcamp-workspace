// Exam0210.java
// 주제 : 소스 파일명과 클래스명의 관계

package com.eomcs.basic.ex01;

// # 클래스 이름과 소스 파일 이름 I
//  - 공개 클래스의 경우 소스 파일명이 클래스 이름과 같아야 한다. 다르면 컴파일 오류가 발생한다.
//  - 비공개 클래스의 경우 클래스명과 소스 파일명이 일치하지 않아도 된다.
//
// ## 클래스 접근 제어
//  - 클래스를 선언할 때 사용 범위를 조정할 수 있다.
//  - public : 다른 패키지의 클래스가 사용할 수 있게 공개한다.
//  - (default) : 같은 패키지에 소속된 클래스만이 사용할 수 있다.
//  - 문법
//  - 공개: public class 클래스명 {...}
//  - 비공개: class 클래스명 {...}

//다음과 같이 클래스명과 소스 파일명이 다르더라도 괜찮다. 
class Exam0210x {
    // 자바 명령 작성

}

// ## 클래스와 소스 파일
//  - 클래스의 공개 여부와 상관없이 보통 한 소스 파일에 한 클래스를 작성한다.
//  - 클래스명과 소스 파일명을 같게 하여 유지보수할 때 클래스를 찾기 쉽게 한다. 