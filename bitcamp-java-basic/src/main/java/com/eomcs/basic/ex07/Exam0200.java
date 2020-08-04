// 메서드

package com.eomcs.basic.ex07;

public class Exam0200 {
  public static void main(String[] args) {

    System.out.println("----------------");
    m1(); // 메서드 호출

    System.out.println("----------------");
    m2("홍길동"); // "홍길동"과 같이 넘겨주는 값을 arguments라 한다.

    //m2(); // argument가 없다.
    //m2(100); // argument의 형식이 맞지 않음!
    //int r = m2("홍길동"); // return값과 변수의 데이터 타입이 맞지 않음!

    System.out.println("----------------");
    String message = m3();
    System.out.println(message);

    m3(); // 꼭 return값을 받아야 하는 것은 아니다.
    //int result = m3();// return값과 변수의 데이터 타입이 맞지 않음!
    //message - m3(100);

    System.out.println("----------------");
    message = m4("홍길동");
    System.out.println(message);

    System.out.println("----------------");
    message = m5("홍길동", 20, false);
    System.out.println(message);

    System.out.println("----------------");
    m6("홍길동", 100, 90, 80);

    System.out.println("----------------");
    m7("홍길동", new int[] {100, 90, 80, 70}); // 배열의 주소만 주고받을 수 있다!
    m7("홍길동", new int[] {100, 90});
    m7("홍길동", new int[] {});

    System.out.println("----------------");
    m8("홍길동", 100, 90, 80, 70, 60);
    m8("홍길동", 100, 90);
    m8("홍길동", 100);
    m8("홍길동"); // 크기가 0인 배열이 만들어진다.

    System.out.println("----------------");
    m10(new int[] {100, 90, 80}, new String[] {"국어", "영어", "수학"}, "홍길동");

    System.out.println("----------------");
    // 2 + 3 + 7 + 4 = ?
    int sum = 0;
    sum = plus(2, 3);
    sum = plus(sum, 7);
    sum = plus(sum, 4);
    System.out.println(sum);

    //위의 코드를 한 줄로 해결할 수도 있다.
    System.out.println(plus(plus(plus(2, 3),7),4));

  }

  //값을 입력받지 않는 메서드
  static void m1() {
    System.out.println("Hello!");
  }

  //값을 입력받는 메서드
  static void m2(String name) { // 넘겨받는값을 parameter라 한다.
    System.out.println(name + "님 반갑습니다!");
  }

  // 값을 입력받지 않지만 리턴값이 있는 메서드
  static String m3() {
    return "안녕!";
  }

  // 값을 입력받고 리턴값이 있는 메서드
  static String m4(String name) {
    return name + "님 반갑습니다. ^^";
  }

  // 값을 여러개 입력받는 메서드
  // 리턴값은 항상 1개!
  static String m5(String name, int age, boolean working) {
    return age +"살 " + name + "님은 현재 재직 상태가 " + working + "입니다.";
  }

  // 변수의 수가 고정된 메서드
  static void m6(String name, int a, int b, int c) {
    int sum = a + b + c;
    int aver = sum / 3;
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }

  // 변수의 수가 고정되지 않은 메서드
  static void m7(String name, int[] scores) {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if (scores.length > 0) {
      aver = sum / scores.length;
    }
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }

  // 가변 파라미터
  static void m8(String name, int... scores) { // 사용 방법은 배열과 같다!
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int aver = 0;
    if (scores.length > 0) {
      aver = sum / scores.length;
    }
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }


/*

  // 가변 파라미터는 무조건 맨 끝에 와야 한다.
  static void m9(int... scores, String name) {
  }

  // 가변 파라미터는 여러 개 선언할 수 없다.
  static void m9(int... scores, int... scores2) {
    //m9(100, 90, 80, 70); // 어떤 파라미터가 어디에 속하는지 알 수 없다.
  }

  // 가변 파라미터 중간에 다른 타입의 변수가 오더라도
  // 가변 파라미터를 한 개 초과하여 둘 수 없다.
  static void m9(String... titles, String name, int...is scores) {
    // m9("국어", "수학", "홍길동", 100, 90);
  }

*/


  static void m10(int[] scores, String[] titles, String name) {
    if (scores.length != titles.length) {
      System.out.println("과목 수와 점수의 개수가 다릅니다.");
      return;
    }

    System.out.println(name + "님 점수!");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s = %d점\n", titles[i], scores[i]);
    }
  }

  // 값을 받아서 내부에서 계산을 한 후 리턴하는 메서드
  static int plus(int a, int b) {
    return a + b;
  }

}
