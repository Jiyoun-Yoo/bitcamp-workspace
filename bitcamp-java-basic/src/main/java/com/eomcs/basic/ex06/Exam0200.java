// 흐름 제어문 - switch

package com.eomcs.basic.ex06;

public class Exam0200 {
  public static void main (String[] args) {
    final int DEVELOPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;

    int type = GENERAL_MANAGER;

    if (type == DEVELOPER) {
      System.out.println("정보처리기사 자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENERAL_MANAGER) {
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILDING_MANAGER) {
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }

    System.out.println("-----------------------------");

    // 단순 값을 비교할 때는 switch문을 사용하면 편하다.
    // 복잡한 값을 비교할 때는 if문을 사용하는 편이 낫다.
    switch (type) {
      case DEVELOPER: // case 다음에는 '값'이 와야 한다. 변수는 올 수 없다.
        System.out.println("정보처리기사 자격증");
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break; // break를 반드시 넣어야 함!
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
        default:
          System.out.println("잘못된 지원입니다.");
    }

    System.out.println("-----------------------------");

    // 의도적으로 break를 생략하는 경우도 있다.
    switch (type) {
      case DEVELOPER:
        System.out.println("정보처리기사 자격증");
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
        default:
          System.out.println("잘못된 지원입니다.");
    }

    System.out.println("-----------------------------");

    int score = 70;

    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
        System.out.println("C");
        break;
      default:
        System.out.println("D");
    }

    // switch문은 값이 명확하게 정해져있는 경우에 사용한다.
    // 값이 어떤 범위에 속하는지 알고 싶다면? if문 사용!

    System.out.println("-----------------------------");

    String value = "developer";
    final String value2 = "developer2";

    switch (value) { // 4byte 이하 정수(byte, short, int, char), 문자열
      case value2: // 값이 변하지만 않으면 OK!
        break;
      case "developer":
        break;
      case "manager":
        break;
      case "ok" + "haha": // 상수 표현식 OK!
        break;
        default:
    }

    System.out.println("-----------------------------");

    int value3 = 100;
    int x = 200;

    switch (value3) {
      case 100:
        break;
      case 100 + 3:
        break;
      //case x: // 컴파일 오류!
        //break;
    }

    System.out.println("-----------------------------");

    Job type2 = Job.DEV;

    switch (type2) {
      case DEV:
        break;
      case GM:
        break;
      case BM:
        break;
    }

  }

  // 상수 그룹을 별도로 만들고, 이름만 기술한다.
  enum Job {
    DEV, GM, BM
  }

}
