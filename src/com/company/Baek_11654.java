package com.company;

import java.util.Scanner;

// 문자열 - 아스키 코드 Main
public class Baek_11654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ascii = in.next().charAt(0);
        in.close();

        System.out.println(ascii);
    }
}