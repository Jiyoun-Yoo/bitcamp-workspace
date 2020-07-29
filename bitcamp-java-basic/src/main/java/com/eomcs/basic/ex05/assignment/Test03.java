package com.eomcs.basic.ex05.assignment;

// 과제
//  다음 int변수에 들어있는 값을
//  첫 바이트부터 끝 바이트까지 순서대로 출력하라.

// 실행 예)
//  값: 0xaabbccd

// 출력) 
//  aa
//  bb
//  cc
//  dd
public class Test03 {

  public static void main(String[] args) {
    int value = 0xaabbccdd; // [10101010_10111011_11001100_11011101]

    // 코드를 완성하시오!
    
    System.out.println(Integer.toHexString(value >> 24 & 0xff));
    //   [11111111_11111111_11111111_10101010] = ffffffaa
    // & [00000000_00000000_00000000_11111111]
    //--------------------------------------
    //   [00000000_00000000_00000000_10101010] = 000000aa

    System.out.println(Integer.toHexString(value >> 16 & 0xff));
    System.out.println(Integer.toHexString(value >> 8 & 0xff));
    System.out.println(Integer.toHexString(value & 0xff));
  }
}








