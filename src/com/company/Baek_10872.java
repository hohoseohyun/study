package com.company;

import java.util.Scanner;

/*
    백준 - 재귀 / [10872] 팩토리얼 (Java)
    Main
 */
public class Baek_10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int result = num == 0 ? 1 : factorial(num);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n <= 1)
            return n;
        else
            return factorial(n - 1) * n;
    }
}