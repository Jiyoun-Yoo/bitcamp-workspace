// Byte Stream - 텍스트 데이터 읽기 II

package com.eomcs.io.ex02;

import java.io.FileInputStream;

public class Exam0522 {

  public static void main(String[] args) throws Exception {
    // JVM 환경 변수 'file.encoding' 값
    System.out.printf("file.encoding=%s\n", System.getProperty("file.encoding"));

    FileInputStream in = new FileInputStream("sample/ms949.txt");

    // 파일의 배열을 한 번에 읽어보자.
    byte[] buf = new byte[1000];
    int count = in.read(buf);

    in.close();

    // 읽은 바이트를 정상적인 UCS2로 변환하여 String 객체를 생성해보자.
    //  - 바이트 배열에 들어있는 문자의 코드가 어떤 규칙에 따라 인코딩되었는지 알려주면 된다.
    //  - ms949.txt는 한글이 MS949로 인코딩되었기 때문에
    //    다음과 같이 String 객체를 생성할 때 알려줘야 한다.
    //  - 그러면 MS949 인코딩 데이터를 정상적으로 UCS2 인코딩 문자로 변환할 것이다.
    //  - 예)
    //      ms949.txt  =>  41 42 a1 b0 a2
    //      UCS2       =>  0041 0042 00a0 00b0 00a1  <== 한글이 UCS2로 정상적으로 변환되었다.
    //
    // new String(byte[], offset, length, charset);
    String str = new String(buf, 0, count);
    System.out.println(str);

    // ms949.txt 파일을 읽을 때 문자가 깨지는 이유?
    //  - 한글이 다음과 같이 MS949 문자 집합으로 인코딩 되어있다.
    //      ms949.txt  =>  41 42 b0 a1 b0 a2
    //  - String 객체를 생성할 때 바이트 배열의 문자 집합을 알려주지 않으면
    //    JVM 환경 변수 'file.encoding'에 설정된 문자 집합이라고 가정한다.

    //  1) 이클립스에서 실행 => 실패!
    //  - JVM 실행 옵션에 '-Dfile.encoding=UTF-8' 환경 변수가 자동으로 붙는다.
    //  - 따라서 String 클래스는 바이트 배열의 값을 UCS2로 변환할 때 UTF-8 문자표를 사용한다.
    //  - 문제는 바이트 배열의 값이 MS949로 인코딩되어 있다는 사실이다.
    //    즉 잘못된 문자표를 사용하니까 변환을 잘못한 것이다.

    //  2) Windows 콘솔에서 실행 => 성공!
    //  - JVM을 실행할 때 'file.encoding' 환경 변수를 지정하지 않으면
    //    OS의 기본 문자 집합으로 설정한다.
    //  - Windows의 기본 문자 집합은 MS949다.
    //    따라서 file.encoding 값은 MS94로 설정된다.
    //  - 바이트 배열의 값이 MS949이기 때문에 MS949 문자표로 변환하면
    //    UCS2 문자 코드로 잘 변환되는 것이다.

    // MS949 코드를 UTF-8 문자로 가정하고 다룰 때 한글이 깨지는 원리!
    // ms949.txt
    //  - 즉 파일에서 읽어들인 바이트 배열이 UTF-8이라고 가정한다.
    //    그래서 UTF-8 변환 규칙에 따라 바이트 배열의 값을 UCS2로 변환한다.
    //    ms949.txt => 01000001 01000010 11010000 10100001 10110000 10100010 = 41 42 b0 a1 b0 a2
    //    변환)
    //    byte(UTF-8) => char(UCS2)
    //      01000001  -> 00000000 01000001 (00 41) = 'A'  <== 정상적으로 변환되었다.
    //      01000010  -> 00000000 01000010 (00 42) = 'B'  <== 정상적으로 변환되었다.
    //      11010000  ->  <== 해당 바이트가 UTF-8 코드 값이 아니기 때문에 UCS2로 변환할 수 없다.
    //      10100001  ->      그래서 '꽝'을 의미하는 특정 코드값이 들어갈 것이다.
    //      10110000  ->      그 코드 값을 문자열로 출력하면 �이다.
    //      10100010  ->
  }

}
