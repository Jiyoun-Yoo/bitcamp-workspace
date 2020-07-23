// 부동소수점 리터럴
// - 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;



class Exam0320 // 클래스 선언(class declaration)
{ // 클래스 정의(class definition)
    public static void main(String[] args) // 메서드 선언(method declaration)
    { // 메서드 정의(method definition)

        // 부동소수점 리터럴은 기본으로 8바이트 크기를 갖는다.
        System.out.println(3.14);
        System.out.println(3.14D); // D 또는 d를 붙여도 된다.
        System.out.println(3.14d);
        
        // 뒤에 F나 f를 붙이면 4바이트 메모리에 저장한다.
        System.out.println(3.14F); 
        System.out.println(3.14f);
    }
}

//## 정리
//4바이트 부동소수점
//3.14F
//3.14f (주로 사용)
//31.4e-1f
//31.4e-1F
//
//8바이트 부동소수점
//3.14
//31.4e-1
//