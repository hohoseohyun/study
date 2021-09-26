package com.company;

import java.util.Scanner;

// 평균은 넘겠지
public class Baek_4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            double average = 0;
            int total = 0;
            int count = 0;

            int num = in.nextInt();

            int[] score = new int[num];

            for (int j = 0; j < num; j++) {
                score[j] = in.nextInt();
                total += score[j];
            }

            average = (double) total / num;

            for (int k = 0; k < num; k++) {
                if (score[k] > average) {
                    count++;
                }
            }

            System.out.printf("%.3f", 100.0 * count / num);
            System.out.println("%");

        }

        in.close();
    }
}