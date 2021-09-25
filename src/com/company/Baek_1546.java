package com.company;

import java.util.Arrays;
import java.util.Scanner;

//평균
public class Baek_1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Double[] arr = new Double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextDouble();
        }

        in.close();

        Arrays.sort(arr);
        double max = arr[arr.length - 1];

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / max * 100;
        }
        System.out.println(sum / N);
    }
}