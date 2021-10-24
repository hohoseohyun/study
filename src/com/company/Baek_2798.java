package com.company;

import java.util.Scanner;

/*
    백준 - 브루트 포스 / [2798] 블랙잭 (Java)
    Main
 */
public class Baek_2798 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int result = 0;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= M && M - sum < M - result) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}