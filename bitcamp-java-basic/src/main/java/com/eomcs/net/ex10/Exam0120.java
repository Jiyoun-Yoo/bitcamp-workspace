// Base64 인코딩 : 이미지파일  ==>  인코딩

package com.eomcs.net.ex10;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Exam0120 {

  public static void main(String[] args) throws Exception {
    File file = new File("./sample/test1.jpg");

    // 이미지파일의 바이트를 모두 읽어온다.
    FileInputStream in = new FileInputStream(file);
    byte[] bytes = in.readAllBytes();
    in.close();

    // 위의 바이트 배열을 Base64 알고리즘에 따라 인코딩한다.
    Encoder encoder = Base64.getEncoder();
    byte[] encodedBytes = encoder.encode(bytes);
    System.out.println(new String(encodedBytes));

  }
}
