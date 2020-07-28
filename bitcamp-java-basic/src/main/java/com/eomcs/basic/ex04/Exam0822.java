// 로컬 변수와 블록 III

package com.eomcs.basic.ex04;

public class Exam0822 {
  public static void main(String[] args) {
    
    int a = 100;
    
    switch (a) {
      case 1:
        // int a; // 컴파일 오류!
        // switch 바깥 블록에 같은 이름의 변수가 있다.
        
        // case 문에서 선언한 변수는 switch문에 소속된다.
        int b;
        {
          // 다음과 같이 명확하게 블록 안에 변수를 선언하면
          // 이 블록의 변수가 된다.
          int c;
        }
        
        break;
      
      case 2:
        // int b; // 컴파일 오류!
        // case는 다른 블록으로 취급되지 않는다.
        // case 1에서 선언한 변수는 switch문에 소속된다.
        // 따라서 다음과 같이 아래쪽 case에서 
        // 같은 이름의 변수를 선언할 수 없다.
        int c; // OK!
        
        break;
        
      case 3:
        for(int i = 0; i < 100; i++) {
          // int b; // 컴파일 오류!
          // for의 바깥 블럭인 switch문에 이미 변수 b가 있다.          
        }
        
        break;
        
      default:
    }    
  }
}
