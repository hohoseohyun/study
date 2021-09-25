package com.company;

import java.util.Arrays;
import java.util.Scanner;

//숫자의 개수
public class Baek_2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        in.close();

        String[] result = String.valueOf(a * b * c).split("");
        Arrays.sort(result);

        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < result.length; j++) {
                if (i == Integer.valueOf(result[j])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}