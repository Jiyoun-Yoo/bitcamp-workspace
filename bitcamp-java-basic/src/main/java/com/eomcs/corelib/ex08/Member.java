package com.eomcs.corelib.ex08;

public class Member {
  String name;
  int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Member [name=" + name + ", age=" + age + "]";
  }

  //hashCode()와 equals()를 오버라이딩하지 않았다.
}
