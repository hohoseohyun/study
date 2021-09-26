package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [2675] 문자열 반복 (Java)
    Main
 */
public class Baek_2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            String s = in.next();
            String result = "";

            for (int j = 0; j < s.length(); j++) {
                int count = 0;
                String temp = "";
                while (num != count) {
                    temp += s.charAt(j);
                    count++;
                }
                result += temp;
            }
            System.out.println(result);
        }

        in.close();
    }
}