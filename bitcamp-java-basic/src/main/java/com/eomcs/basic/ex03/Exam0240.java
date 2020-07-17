// 주제 : 정수 값을 메모리에 저장하는 방법

package com.eomcs.basic.ex03;


class Exam0240 {
    int a = 0xaaaaaaaa;
    int b = -0xaaaaaaaa;
    public static void main(String[] args){
       System.out.println(5 - 3); // 연산자와 피연산자 사이 공백 두기
       System.out.println(5 + (-3));

        // 0000 0011 : +3 2진수
        // 1111 1101 : -3 2진수(2의 보수)
        // 1000 0011 : -3 Sign-Magnitutde
        // 0111 1100 : -3 Excess-K (k = 2**-비트수 -1) - 1
        // 124 = 0+0+4+8+16+32+64 
        // K = 2**(8 -1) = 2**7 - 1 = 128 - 1 = 127

        // 0111 1011: +123 2진수
        // 1000 0101 : -123 2진수(2의 보수)
        // 1111 1011 : -123 Sign-Magnitutde
        // 0000 0100 : -123 Excess-K (k = 2**-비트수 -1) - 1
        // 123 = 1+2+0+8+16+32+64

        // 10101010 10101010 10101010 10101010: +aaaa aaaa 2진수
        // 01010101 01010101 01010101 01010111 : -aaaa aaaa 2진수(2의 보수)
        // 55 55 55 56 : 16진수

    }
}