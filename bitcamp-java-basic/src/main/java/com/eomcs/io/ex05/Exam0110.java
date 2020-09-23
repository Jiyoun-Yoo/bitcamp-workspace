// 객체 출력 - 인스턴스의 값을 출력

package com.eomcs.io.ex05;

import java.io.FileOutputStream;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test4.data");

    Member member = new Member();
    member.name = "AB가각간";
    member.age = 27;
    member.gender = true;

    // 인스턴스의 값을 출력하라!
    // 1) 이름 출력
    byte[] bytes = member.name.getBytes("UTF-8");
    out.write(bytes.length); // 1 바이트
    out.write(bytes); // 문자열 바이트

    // 2) 나이 출력 (4바이트)
    //  write()는 가장 끝의 1바이트만 출력하므로, 비트연산을 해야한다.
    //  나이는 int 값이므로, 총 4바이트를 출력해야한다.
    out.write(member.age >> 24);
    out.write(member.age >> 16);
    out.write(member.age >> 8);
    out.write(member.age);

    // 3) 성별 출력 (1바이트)
    if (member.gender)
      out.write(1);
    else
      out.write(0);

    // 값을 출력하는 방식이 번거롭다!
    //  => FileOutputStream을 상속받는 DataOutputStream을 만들어 사용한다.

    out.close();

    System.out.println("데이터 출력 완료!");
  }
}
