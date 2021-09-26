package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [11720] 숫자의 합 (Java)
    Main
 */
public class Baek_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String num = in.next();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += num.charAt(i) - '0';
        }

        in.close();

        System.out.println(sum);
    }
}