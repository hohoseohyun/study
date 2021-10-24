package com.company;

import java.util.Scanner;

/*
    백준 - 재귀 / [10870] 피보나치 수 5 (Java)
    Main
 */
public class Baek_10870 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(fibo(num));
    }

    public static int fibo(int n) {
        if (n <= 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
}