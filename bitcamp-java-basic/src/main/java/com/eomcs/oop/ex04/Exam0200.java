// 인스턴스 메서드와 클래스 메서드의 활용

package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0200 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("ABC가각");

    // 인스턴스 메서드
    //  - non-static 메서드
    //  - 인스턴스 주소를 가지고 호출해야 한다.
    //  - this라는 내장 변수가 있다.
    //  - 특정 인스턴스의 변수를 다루는 메서드
    // => 메서드를 실행할 때 반드시 인스턴스의 주소를 알려줘야 한다.
    //    예) 인스턴스주소.메서드이름();

    char c1 = s1.charAt(1);
    System.out.println(c1);

    char c2 = s2.charAt(1);
    System.out.println(c2);

    System.out.println(s1.compareTo(s2));
    // 출력이 양수인지음수인지에 따라 앞뒤 순서를 알 수 있다.

    System.out.println(s1.contains("ll"));
    System.out.println(s1.contains("ll"));
    // 문자열 안에 특정 문자열이 포함되어있는지 알 수 있다.

    System.out.println(s1.equals(s2));

    System.out.println("---------------");

    // 스태틱 메서드
    //  - 특정 인스턴스에 대해 작업하는 것이 아니라,
    //    주어진 파라미터 정보만을 가지고 작업한다.
    //    예) 클래스이름.메서드();
    byte[] bytes = s2.getBytes();
    // JVM(UTF-16)  ===>  OS의 기본 문자표(Linux/Unix : UTF-8, windows : ms949)
    // "ABC가각"
    //  - Linux/Unix : 41 42 43 ea b0 80 ea b0 81
    //  -   Windows  : 41 42 43 b0 a1 b0 a2
    for (byte b : bytes ) {
      System.out.println(Integer.toHexString(b & 0xff));
      // & 0xff 하는 이유? ffffffea에서 앞의 ffffff를 떼기 위해!
    }

    System.out.println("---------------");
    bytes = s2.getBytes("ms949");
    // JVM(UTF-16)  ===>  지정한 문자표(ms949) - 실무에서는 주로 UTF-8을 쓴다!!!
    // "ABC가각"
    //  - Windows  : 41 42 43 b0 a1 b0 a2
    for (byte b : bytes ) {
      System.out.println(Integer.toHexString(b & 0xff));
    }

    System.out.println("---------------");
    // 주어진 문자열을 특정 형식으로 리턴하는 메서드
    String s3 = String.format("%s님 방가방가!","홍길동");
    System.out.println(s3);

    // 주어진 문자열을 합치는 메서드
    String s4 = String.join(",", "홍길동", "임꺽정", "유관순");
    System.out.println(s4);

    // 주어진 값을 문자열로 만들어서 리턴하는 메서드
    //  - 실제로는 문자열 인스턴스를 만들어서 그 주소를 리턴한다.
    String s5 = String.valueOf(true);
    String s6 = String.valueOf(100);
    String s7 = String.valueOf(3.14f);
    System.out.printf("%s %s %s\n", s5, s6, s7);


    // Math 클래스의 메서드는 대부분 static 메서드이다.
    System.out.println(Math.abs(-100));
    System.out.println(Math.ceil(-3.28));
    System.out.println(Math.floor(-3.28));
    System.out.println(Math.round(3.14));
    System.out.println(Math.round(3.54));
    System.out.println(Math.pow(2, 7));

    Date d1 = new Date();
    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDate());
    System.out.println(d1.getDay());

    long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
    System.out.println(millis);

    // 클래스 이름이 동일한 경우, 둘 중 하나는 클래스 이름을 붙여줘야 한다.
    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDate());

    long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDate());

    System.out.println("---------------");
    // 실무에서 년월일시분초를 뽑아낼 때는 Calendar를 쓴다.
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(1)); // year
    System.out.println(cal.get(2) + 1); // month
    System.out.println(cal.get(5)); // date
    System.out.println(cal.get(7)); // day (1: 일요일 ~ 7: 토요일)
    System.out.println(cal.get(4)); // week (해당 월의 몇 번째 주)
    System.out.println(cal.get(10)); // 12 hour
    System.out.println(cal.get(11)); // 24 hour
    System.out.println(cal.get(12)); // minute
    System.out.println(cal.get(13)); // second

    System.out.println(cal.get(Calendar.YEAR)); // year
    System.out.println(cal.get(Calendar.MONTH)); // month
    System.out.println(cal.get(Calendar.DATE)); // date
    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // day (1: 일요일 ~ 7: 토요일)
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); // week (해당 월의 몇 번째 주)
    System.out.println(cal.get(Calendar.HOUR)); // 12 hour
    System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24 hour
    System.out.println(cal.get(Calendar.MINUTE)); // minute
    System.out.println(cal.get(Calendar.SECOND)); // second

    // primitive를 인스턴스를 만들어 저장할 때 쓰는 방법이 있다.
    // int -> Integer, byte -> Byte, short -> Short, long -> Long
    // float - > Float, double -> Double, char -> Character
    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i1 == i2); // false

    // 더 나은 방법
    //  - 클래스메서드를 사용한다.
    Integer i3 = Integer.valueOf(100);
    Integer i4 = Integer.valueOf(100);

    System.out.println(i3.toString());
    System.out.println(i4.toString());
    System.out.println(i3 == i4); // true
  }
}
