// 흐름 제어문 - switch 문법 II

package com.eomcs.basic.ex06;

public class Exam0242 {

  // 상수를 좀 더 조직적으로 관리하는 방법
  //  => enum을 사용하여 상수를 정의한다.
  //  => nested enum은 기본이 static이다.
  //     그래서 static을 생략해도 된다.

  enum Level {
    GUEST, MEMBER, ADMIN
  }
  public static void main(String[] args) {

    Level level = Level.MEMBER;

    switch(level) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
        break;
      case MEMBER:
        System.out.println("글작성 가능합니다.");
        break;
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
    }

  }
}
