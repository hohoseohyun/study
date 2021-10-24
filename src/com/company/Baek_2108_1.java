package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
    백준 - 정렬 / [2108] 통계학 (Java)
    Main
 */
public class Baek_2108_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            산술평균 : N개의 수들의 합을 N으로 나눈 값
            중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
            최빈값 : N개의 수들 중 가장 많이 나타나는 값
            범위 : N개의 수들 중 최댓값과 최솟값의 차이
         */

        int N = in.nextInt();

        int[] arr = new int[N];
        int[] check = new int[8001];
        int[] result = new int[4];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            check[arr[i] + 4000]++;
        }

        double sum = Arrays.stream(arr).sum();

        Arrays.sort(arr);

        result[0] = (int) Math.round(sum / N);
        result[1] = arr[N / 2];
        result[3] = arr[N - 1] - arr[0];

        int max = Arrays.stream(check).max().getAsInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (check[i] == max) {
                list.add(i - 4000);
            }
        }

        if (list.size() == 1) {
            result[2] = list.get(0);
        } else {
            Collections.sort(list);
            result[2] = list.get(1);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }
    }
}