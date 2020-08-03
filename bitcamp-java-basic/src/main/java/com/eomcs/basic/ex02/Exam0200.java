// javadoc 주석

package com.eomcs.basic.ex02;

// 주석 - Javadoc 주석
//  - "java document comment(doc comment)"
//  - javadoc에서 HTML 문서를 만들 때 사용하는 주석이다.
//  - 주로 API 문서를 자동 생성할 때 사용한다.
//  - 클래스나 메서드, 변수 선언에 붙일 수 있다.

/**
 * 클래스에 대한 설명
 * 클래스에 대한 설명
 * <p>중간에 HTML 태그를 넣을 수 있다.<p>
 * @author jiyounyou
 */
public class Exam0200 {


  /**
   * 필드에 대한 설명<br>
   * <b>필드</b>에 대한 설명<br>
   */


  /**
   * 변수에 대한 설명
   * 변수 선언 앞에 설명을 붙여 놓으면 나중에 HTML 문서를 만들 때 추출할 수 있다.
   */
  static String message = "Hello, world!";


  /**
   * 메서드에 대한 설명<br>
   * <i>메서드</i>에 대한 설명<br>
   * 메서드에 대한 설명
   * @param args 파라미터에 대한 설명
   */

     public static void main(String[] args){

     }

   /**
    메서드 설명
    메서드 설명 OK!
    */

     public void m() {
        // ...

     }
}
