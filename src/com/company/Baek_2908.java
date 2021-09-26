package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [2908] 상수 (Java)
    Main
 */
public class Baek_2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num1 = in.next();
        String num2 = in.next();

        in.close();

        String test1 = "";
        String test2 = "";

        for (int i = num1.length() - 1; i >= 0; i--) {
            test1 += num1.charAt(i);
            test2 += num2.charAt(i);
        }

        if (Integer.valueOf(test1) > Integer.valueOf(test2)) {
            System.out.println(test1);
        } else {
            System.out.println(test2);
        }
    }
}