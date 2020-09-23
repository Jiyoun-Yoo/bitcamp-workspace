// 활용 - 지정한 폴더를 삭제하라.

package com.eomcs.io.ex01;

import java.io.File;

public class Exam0720 {

  public static void main(String[] args) throws Exception {

    // 1) 지정한 폴더를 디렉토리를 삭제한다.
    // 2) 폴더를 삭제하는 코드를 별도의 메서드로 분리한다.
    // 3) 새로 만든 메서드를 사용하도록 코드를 수정한다.
    // 4) 주어진 파일이 디렉토리라면 하위 파일이나 디렉토리를 찾아 지운다.

    // temp 디렉토리를 삭제하기
    File dir = new File("temp");

    deleteFile(dir);
  }

  static void deleteFile(File dir) {
    // 주어진 파일이 디렉토리라면 하위 파일이나 디렉토리를 찾아 지운다.
    if (dir.isDirectory()) {
      File[] files = dir.listFiles();
      for (File file : files) {
        deleteFile(file);
      }
    }

    dir.delete(); // 현재 파일이나 폴더 지우기
  }

}


