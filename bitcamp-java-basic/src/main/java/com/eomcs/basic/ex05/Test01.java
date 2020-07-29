package com.eomcs.basic.ex05;

public class Test01 {
  public static void main(String[] args) {
    // 00000000
    // ||||||||- css
    // |||||||- html
    // ||||||- php
    // |||||- python
    // ||||- javascript
    // |||- java
    // ||- c++
    // |- c
    
    final int CSS        = 0x01;
    final int HTML       = 0x02;
    final int PHP        = 0x04;
    final int PYTHON     = 0x08;
    final int JAVASCRIPT = 0x10;
    final int JAVA       = 0x20;
    final int CPP        = 0x40;
    final int C          = 0x80;
    
    // C, Java, Python, HTML을 할 줄 아는 개발자의 정보를 설정
    int lang = C | JAVA | PYTHON | HTML;
    
    System.out.println(Integer.toBinaryString(lang));
  }
}