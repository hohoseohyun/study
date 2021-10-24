package com.company;

import java.util.*;

/*
    백준 - 정렬 / [2108] 통계학 (Java)
    Main
 */
public class Baek_2108 {
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
        int[] result = new int[4];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        double sum = Arrays.stream(arr).sum();

        Arrays.sort(arr);

        result[0] = (int) Math.round(sum / N);
        result[1] = arr[N / 2];
        result[3] = arr[N - 1] - arr[0];

        HashMap<Integer, Integer> test = new HashMap<>();

        for (int i = 0; i < N; i++) {
            test.put(arr[i], test.getOrDefault(arr[i], 0) + 1);
        }

        // Comparator 정의
        Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };

        // 최대값이 1인 경우
        if (Collections.max(test.values()) == 1) {
            result[2] = N > 1 ? arr[1] : arr[0];
        } else {

            Map.Entry<Integer, Integer> maxEntry = Collections.max(test.entrySet(), comparator);
            result[2] = maxEntry.getKey();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }
    }
}