package com.company;

import java.util.Scanner;

/*
    백준 - 브루트 포스 / [7568] 덩치 (Java)
    Main
 */
public class Baek_7568 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] person = new int[N][2];
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            result[i] = 1;
            person[i][0] = in.nextInt();
            person[i][1] = in.nextInt();
        }

        in.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j && person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                    result[i]++;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.printf(String.valueOf(result[i]) + " ");
        }
    }
}