// 생성자 - 인스턴스를 사용하기 전에 초기화시키는 역할을 한다.

package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0110 {
  public static void main(String[] args) throws Exception {

    // 8개의 기본형 데이터 타입을 제외한 모든 변수는
    // 주소를 담는 레퍼런스 변수이다.
    String s1 = new String();
    System.out.println("=>" + s1);

    String s2 = new String("Hello!");
    System.out.println("=>" + s2);

    char[] chars = new char[] {'H','E','L','L','O','2','!'};
    String s3 = new String("Hello!");
    System.out.println("=>" + s3);

    // 네트워크에서는 문자열을 주로 byte 배열로 받는다.
    // 어떤 규칙에 따라 byte로 표현했는지 지정을 해야 한다.
    // byte의 범위 : -128(ff) ~ 127(7f)
    byte[] bytes = new byte[] {
    0x41, // A(0100 0001) ==> (00000000 01000001) 0041
    0x42, // B(0100 0010) ==> (00000000 01000010) 0042
    (byte)0xEA, // 가 ==> AC00
    (byte)0xB0,
    (byte)0x80,
    (byte)0xEA,// 각 ==> AC01
    (byte)0xB0,
    (byte)0x81,
    };
    // Java는 UTF-16을 사용한다.
    // UTF-8 규칙에 따라 만든 문자 코드라는 정보를 줘야 한다.
    String s4 = new String(bytes, "UTF-8");
    System.out.println("=>" + s4);

    byte[] bytes2 = new byte[] {
        0x41, // A(0100 0001) ==> (00000000 01000001) 0041
        0x42, // B(0100 0010) ==> (00000000 01000010) 0042
        (byte)0xB0, // 가 ==> AC00
        (byte)0xA1,
        (byte)0xB0, // 각 ==> AC01
        (byte)0xA2,
        (byte)0xB6, // 똘 (EUC-KR)
        (byte)0xCA,
        (byte)0x8C, // 똠 (MS494/CP949)
        (byte)0x63,
        (byte)0xB6, // 똥 (EUC-KR)
        (byte)0xCB
    };
    String s5 = new String(bytes2, "MS949"); // MS949(11172자) = EUC-KR(2350자)
    System.out.println("=>" + s5);

    // java.util.Date
    // 실행하는 시점의 날짜와 시분초를 저장한다.
    Date d1 = new Date();
    System.out.println(d1.toString());
    System.out.println(d1);
    // 아규먼트가 primitive type이나 String 타입이 아니면
    // 인스턴스에 대해 toString()을 호출하여 그 리턴 값을 출력한다.
    // 자바의 모든 클래스의 인스턴스에 대해 toString()을 호출할 수 있다.

    int[] arr = new int[] {100, 200, 300};
    System.out.println(arr.toString());
    System.out.println(arr);
    // 메모리 주소X, 해시코드가 출력된다. (인스턴스를 식별하는 고유 값)

    int a = 100;
    System.out.println(a); // a.toString()으로 쓰면 컴파일 오류!

    Date d2 = new Date(100000);
    System.out.println(d2);

    Date d3 = new Date(120, 8, 10);
    System.out.println(d3);

    // java.util.Calendar
    // 클래스 중에서는 생성자가 존재하지만, 생성자를 공개하지 않은 경우가 있다.
    // 이런 클래스의 인스턴스를 만들려면 보통 다음 2가지 방법을 사용한다.
    // 1) 다른 클래스의 도움을 받는다.
    // 2) 해당 클래스에서 제공하는 클래스 메서드(스태틱 메서드)를 사용한다.
    //    인스턴스 없이 사용해야하기 때문에 클래스 메서드!
    //
    // Calendar c1 = new Calendar();
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1); //c1.toString();

    Car car1 = new Car();
    Car car2 = new Car();
    System.out.println(car1 == car2);
    car1.model = "티코";
    car1.cc = 980;
    car2.model = "소나타";
    car2.cc = 1980;
    System.out.println(car1.model);
    System.out.println(car2.model);

    // Car2 car3 = new Car2();
    // 인스턴스를 한개만 만들 수 있는 경우
    Car2 car3 = Car2.getInstance();
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4); // true 출력
    car3.model = "비트카";
    System.out.println(car4.model); // 비트카 출력
  }
}

class Car {
  String model;
  int cc;
}

class Car2 {
  String model;
  int cc;
  static Car2 obj;
  private Car2() {

  }

  static Car2 getInstance() {
    // 보통 생성자를 private으로 막는 경우는
    // 인스턴스를 한 개만 생성하도록 제한하고 싶을 때이다.
    //  => 클래스 메서드를 만들어 인스턴스를 생성한다.

    // 만약 참조변수 obj에 주소가 들어있지 않으면,
    // 인스턴스를 만들어 그 주소를 obj에 저장하고,
    // 그 주소를 리턴하라.
    if (obj == null) {
      obj = new Car2();
    }
    return obj;
  }
}


// A --> 41 (0100 0001)
// B --> 42 (0100 0010)
// 유니코드 (2byte : yyyyyyyy yyyyyyyy)
// UTF-8 (1111yyyy 11yyyyyy 11yyyyyy)
// 가 --> EA B0 80 (11101010 10110000 10000000)
//        AC 00    (10101100 00000000)