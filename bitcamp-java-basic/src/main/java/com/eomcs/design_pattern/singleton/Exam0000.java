package com.eomcs.design_pattern.singleton;

class Cookie {
  private static Cookie instnace;

  private Cookie() {}

  public static Cookie getInstance() {
    if(Cookie.instnace == null) {
      Cookie.instnace = new Cookie();
    }
    return Cookie.instnace;
  }

}

public class Exam0000 {

  public static void main(String[] args) {

  }

}
