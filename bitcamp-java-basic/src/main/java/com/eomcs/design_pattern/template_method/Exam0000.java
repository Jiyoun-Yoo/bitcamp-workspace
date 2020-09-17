package com.eomcs.design_pattern.template_method;

class Cookie {

  private static Cookie instance;

  private Cookie() {}

  public static Cookie getInstance() {
    if(Cookie.instance == null) {
      Cookie.instance = new Cookie();
    }
    return instance;
  }

}

// 생성자가 존재하지만 pricate으로 비공개되어있기 때문에 직접 호출할 수 없다.
// 생성자를 호출할 수 없으면 인스턴스를 생성할 수 없다.
// 다른 메서드를 호출하여 인스턴스를 생성하라는 의미이다.
// 인스턴스를 생성해주는 특별한 메서드를 통해 인스턴스를 얻는다.
// getInstance()를 호출한다.

public class Exam0000 {
  public static void main(String[] args) {
    Cookie cookie1 = Cookie.getInstance();
    Cookie cookie2 = Cookie.getInstance();

    System.out.println(cookie1 == cookie2);


  }
}
