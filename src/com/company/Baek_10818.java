package com.company;

import java.util.Arrays;
import java.util.Scanner;

//최소, 최대
public class Baek_10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
