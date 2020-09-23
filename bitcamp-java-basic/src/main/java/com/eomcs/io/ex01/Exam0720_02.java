// 활용 - 지정한 폴더를 삭제하라.

package com.eomcs.io.ex01;

import java.io.File;

public class Exam0720_02 {

  public static void main(String[] args) throws Exception {

    // 1) 지정한 폴더를 디렉토리를 삭제한다.
    // 2) 폴더를 삭제하는 코드를 별도의 메서드로 분리한다.

    // temp 디렉토리를 삭제하기
    File dir = new File("temp");

    deleteFile(dir);
  }

  static void deleteFile(File dir) {

  }

}

