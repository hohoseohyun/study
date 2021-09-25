package com.company;

import java.util.Arrays;
import java.util.Scanner;

//나머지
public class Baek_3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt() % 42;
        }

        in.close();

        Arrays.sort(arr);

        int temp = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp != arr[i]) {
                temp = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}