package com.company;

import java.util.Scanner;

//최댓값
public class Baek_2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        int index = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}