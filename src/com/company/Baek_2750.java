package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
    백준 - 정렬 / [2750] 수 정렬하기 (Java)
    Main
 */
public class Baek_2750 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}