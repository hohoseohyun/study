package com.company;

import java.util.Scanner;

//OX퀴즈
public class Baek_8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        in.close();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}