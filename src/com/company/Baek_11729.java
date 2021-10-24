package com.company;

import java.util.Scanner;

/*
    백준 - 재귀 / [11729] 하노이 탑 이동 순서 (Java)
    Main
 */
public class Baek_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int N, int start, int mid, int end) {
        if (N == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }

        // Step 1: N-1 개를 A에서 B로 이동
        hanoi(N - 1, start, end, mid);

        // Step 2: 1개를 A에서 C로 이동
        sb.append(start + " " + end + "\n");

        // Step 3: N-1개를 B에서 C로 이동
        hanoi(N - 1, mid, start, end);
    }
}