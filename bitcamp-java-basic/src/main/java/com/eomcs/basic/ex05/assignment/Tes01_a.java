package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Tes01_a {
  public static void main(String[] args) {
    // 나의 풀이
    Scanner input = new Scanner(System.in);
    
    System.out.print("첫 번째 숫자를 입력하세요! > ");
    int first = input.nextInt();
    
    System.out.print("두 번째 숫자를 입력하세요! > ");
    int second = input.nextInt();
    
    System.out.printf("%d와 %d의 합은 %d입니다.", first, second, first + second);
    
    input.close();
  }
}








