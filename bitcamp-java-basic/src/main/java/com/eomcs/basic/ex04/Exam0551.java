// 배열 - 배열 레퍼런스와 null

package com.eomcs.basic.ex04;

public class Exam0551 {
  public static void main(String[] args) {

    int[] arr1;
    arr1 = new int[5];

    // 배열 레퍼런스를 초기화시키고 싶다면 null로 설정하라.
    arr1 = null; // 0으로 설정 => 레퍼런스가 아무것도 가리키지 않음을 의미

    // 레퍼런스가 배열 인스턴스를 가리키지 않은 상태에서 사용하면?
    System.out.println(arr1[0]); // NullPointerException 실행 오류!
  }
}