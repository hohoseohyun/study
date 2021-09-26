package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [5622] 다이얼 (Java)
    Main
 */
public class Baek_5622 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num = in.next().toUpperCase();

        in.close();

        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            char temp = num.charAt(i);
            if (temp >= 'A' && temp <= 'C') {
                result += 3;
            } else if (temp >= 'D' && temp <= 'F') {
                result += 4;
            } else if (temp >= 'G' && temp <= 'I') {
                result += 5;
            } else if (temp >= 'J' && temp <= 'L') {
                result += 6;
            } else if (temp >= 'M' && temp <= 'O') {
                result += 7;
            } else if (temp >= 'P' && temp <= 'S') {
                result += 8;
            } else if (temp >= 'T' && temp <= 'V') {
                result += 9;
            } else if (temp >= 'W' && temp <= 'Z') {
                result += 10;
            }
        }
        System.out.println(result);
    }
}