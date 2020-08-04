package com.eomcs.basic.ex07;

import java.util.Properties;
import java.util.Set;

public class Exam0500 {

  // 실행하는 클래스는 다음과 같이 main() 메서드의 시그너처(signature)를 가져야 한다.
  //  => method signature == function prototype == 메서드 선언
  //  => 파라미터의 이름은 상관없다. 한글로 적어도 된다.
  public static void main(String... args) {

    // 프로그램 아규먼트
    //  > java Exam0510 aaaa bbbb cccc
    //  예) java -cp bin/main com.eomcs.basic.ex07.Exam0510 aaa bbb ccc
    System.out.println(args.length); // 3 출력

    System.out.println("----------------");
    for (String str : args) {
      System.out.println(str);
    }
    /*  출력
         aaa
         bbb
         ccc
     */

    System.out.println("----------------");
    // JVM 아규먼트
    //  > java -D이름=값 -D이름=값 Exam0510
    //  예) java -cp bin/main -Dname=aaa -Dage=20 com.eomcs.basic.ex07.Exam0510 aaa bbb ccc
    String s1 = System.getProperty("name");
    String s2 = System.getProperty("age");
    System.out.println(s1); // aaa 출력
    System.out.println(s2); // 20 출력


    System.out.println("----------------");
    // JVM의 전체 프로퍼티 목록
    //  - JVM의 기본 환경 변수
    Properties props = System.getProperties();
    Set keyList = props.keySet();

    for (Object key : keyList) {
      System.out.printf("%s ---> %s\n", key, System.getProperty((String)key));
    }

  }

}
