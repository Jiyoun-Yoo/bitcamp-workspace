// 메모리 크기에 따른 부동 소수점의 크기

package com.eomcs.basic.ex03;

class Exam0340 {
  public static void main(String[] args) {

    // 4바이트 메모리에 부동 소수점 저장하기
    System.out.println("1------------------------");
    System.out.println(999.9999f);
    System.out.println(999999.9f);
    System.out.println(9.999999f);

    // 4바이트 메모리는 최대 7자리의 부동소수점을 저장할 수 있다.
    // 초과하는 경우 반올림처리되거나 잘린다.
    System.out.println("2-----------------------");
    System.out.println(999.99994f);
    System.out.println(9999999.4f);
    System.out.println(9.9999994f);

    System.out.println("3------------------------");
    System.out.println(987654321.1234567f);
    System.out.println(987654321123456.7f);
    System.out.println(9.876543211234567f);

    // 8바이트 메모리에 부동소수점 저장하기
    System.out.println("4------------------------");
    System.out.println(987654321.1234567);
    System.out.println(987654321123456.7);
    System.out.println(9.876543211234567);

    // 8바이트 메모리에는 최대 16자리의 부동소수점을 저장할 수 있다.
    // 초과하면 반올림 되거나 잘린다.
    System.out.println("5------------------------");
    System.out.println(987654321.12345678);
    System.out.println(9876543211234567.8);
    System.out.println(9.8765432112345678);

    // 유효자릿수
    //  - 소수점을 제외한 숫자의 갯수
    //
    // 4바이트 메모리에는 최대 7자리까지 저장할 수 있다. single precision
    // 8바이트 메모리에는 최대 16자리까지 저장할 수 있다. double precision
    // 초과하는 수는 반올림 처리되거나 잘린다.
    // 유효자릿수라 하더라도 100% 정확하지는 않다.
    // 왜?
    //  IEEE 754 규격에 따라 2진수로 전환할 때
    //  일부 값은 완전히 정확하게 변환되지 않는 경우도 있다.

    // 부동소수점의 일부는 정확하게 2진수로 변환할 수 없다.
    // 부동소수점을 저장할 때 정확하게 저장되지 않는 예)
    System.out.println("6------------------------");
    System.out.println(7 * 0.1); // 연산의 결과인 0.7이 2진수로 바뀔 때 오류!

    // 이유
    //  - IEEE-754 규격에 따라 부동소수점을 2진수로 바꾸다보면
    //    정확하게 2진수로 딱 떨어지지 않는 경우가 있다.
    //    CPU, OS, 컴파일러, JVM의 문제가 아니다.
    //  - IEEE-754의 방법에 내재되어 있는 문제다.
    // 해결책
    //  - 시스템에서 필요한 만큼 소수점 이하 자리수를 적절히 잘라서 사용하라!
  }
}