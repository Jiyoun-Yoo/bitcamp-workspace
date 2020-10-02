package com.eomcs.io.ex01;

import java.io.File;

public class Exam0000 {
  public static void main(String[] args) throws Exception {

    File dir = new File(".");

    File[] files  = dir.listFiles((File file) -> {
        if(file.isFile() && file.getName().endsWith(".java"))
          return true;
        return false;
      });

    for(File file : files) {
      System.out.println(file.getName());
    }

  }
}
