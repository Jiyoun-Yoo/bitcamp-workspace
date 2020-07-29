package com.eomcs.basic.ex05.assignment;

// 과제
//  다음 int변수에 들어있는 값을
//  첫 바이트부터 끝 바이트까지 순서대로 출력하라.

// 실행 예)
//  값: 0xaabbccd
//  aa
//  bb
//  cc
//  dd
public class Test03 {

  public static void main(String[] args) {
    int value = 0xaabbccdd; // 10101010_10111011_11001100_11011101
    
    // 코드를 완성하시오!
    // ex05.Exam0440 참고
    
    int first, second, third, fourth;
    
    first = (value >> 24) & 0xff;
    second = (value >> 16) & 0xff;
    third = (value >> 8) & 0xff;
    fourth = value & 0xff;
    
    // value >> 24
    //  = 11111111_11111111_11111111_10101010
    //  = ffffffaa
    
    System.out.println(Integer.toHexString(value));
    System.out.println(Integer.toHexString(first));
    System.out.println(Integer.toHexString(second));
    System.out.println(Integer.toHexString(third));
    System.out.println(Integer.toHexString(fourth));
    
    }
}








