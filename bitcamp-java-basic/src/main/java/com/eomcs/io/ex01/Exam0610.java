// 디렉토리에 들어있는 파일(디렉토리) 목록을 꺼낼 때 필터 적용하기 I

package com.eomcs.io.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0610 {

  public static void main(String[] args) throws Exception {
    File dir = new File(".");

    // list() 메서드에서 필터로 사용할 객체를 만든다.
    // 단 FilenameFilter라는 호출 규칙에 따라 만든다.
    class JavaFilter implements FilenameFilter {
      @Override
      public boolean accept(File dir/* 부모 경로 */, String name /* 파일,디렉토리 이름 */) {
        // 이 메서드는 list()에서 호출한다.
        // 해당 폴더에 들어 있는 파일이나 디렉토리를 찾을 때 마다 호출한다.
        // (하위 폴더는 뒤지지 않는다)
        // 이 메서드에서 해야 할 일은 찾은 파일이나 디렉토리를
        // 리턴할 배열에 포함시킬지 여부이다.

        // list() 메서드는 해당 디렉토리에서 찾은 파일이나 하위 폴더에 대해
        // 결과에 포함시킬지 말지 결정하기 위해 이 메서드를 매번 호출할 것이다.
        // true를 리턴하면 배열에 포함되고,
        // false를 리턴하면 배열에 포함되지 않는다.

        // 파일,디렉토리 이름이 .java 로 끝나는 경우만 리턴 배열에 포함시킨다.
        if (name.endsWith(".java"))
          return true; // 조회 결과에 포함시키라는 의미로 true를 리턴한다.
        return false; // 조회 결과에서 제외하라는 의미로 false를 리턴한다.
      }
    }

    // => 확장자가 .java 인 파일의 이름만 추출하기
    // 1) 필터 준비
    JavaFilter javaFilter = new JavaFilter();

    // 2) 필터를 사용하여 디렉토리의 목록을 가져오기
    //  - list()를 호출할 때 list()가 사용할 필터를 파라미터로 넘겨준다.
    String[] names = dir.list(javaFilter);

    for (String name : names) {
      System.out.println(name);
    }

    // 문제점:
    //  - temp.java 는 디렉토리이다.
    //  - 현재의 필터는 파일 이름으로만 검사한다.
    //  - 파일인지 디렉토리인지 여부는 검사하지 않는다.
    //  - 해결책?
    //    다음 예제를 보라!
  }

}

