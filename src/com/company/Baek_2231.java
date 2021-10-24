package com.company;

import java.util.Scanner;

/*
    백준 - 브루트 포스 / [2231] 분해합 (Java)
    Main
 */
public class Baek_2231 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        in.close();

        int result = N;

        for (int i = 0; i < N; i++) {
            int temp = i + change(i);
            if (temp == N && result > i) {
                result = i;
            }
        }

        if (result == N) {
            result = 0;

        }
        System.out.println(result);
    }

    public static int change(int n) {
        int result = 0;
        String test = String.valueOf(n);
        for (int i = 0; i < test.length(); i++) {
            result += test.charAt(i) - '0';
        }

        return result;
    }
}