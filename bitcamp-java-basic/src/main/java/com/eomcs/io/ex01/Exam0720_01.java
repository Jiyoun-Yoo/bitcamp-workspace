// 활용 - 지정한 폴더를 삭제하라.

package com.eomcs.io.ex01;

import java.io.File;

public class Exam0720_01 {

  public static void main(String[] args) throws Exception {

    // 1) 지정한 폴더를 디렉토리를 삭제한다.

    // temp 디렉토리를 삭제하기
    File dir = new File("temp");

    dir.delete();
  }

}

