// 주제 : 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;


class Exam0230 {
    public static void main(String[] args){
        // 출력 명령문
        // -  System.out.println(값);

        // 자바 정수값을 저장하는 메모리 기본 크기 : 4byte
        System.out.println(2147483647);
        System.out.println(-2147483648);

        //System.out.println(2147483648);
        //System.out.println(-2147483649);

        // 8바이트 메모리를 사용하는 정수 리터럴
        System.out.println(2147483648L);
        System.out.println(-2147483649L);

        System.out.println(1); // 4바이트 메모리를 사용하는 1
        System.out.println(1L); // 8바이트 메모리를 사용하는 1

        System.out.println(Integer.MAX_VALUE); // 4바이트 정수 최댓값
        System.out.println(Integer.MIN_VALUE); // 4바이트 정수 최솟값

        System.out.println(Long.MAX_VALUE); // 8바이트 정수 최댓값
        System.out.println(Long.MIN_VALUE); // 8바이트 정수 최솟값

    }
}