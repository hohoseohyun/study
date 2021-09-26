package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [1157] 단어 공부 (Java)
    Main
 */
public class Baek_1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine().toUpperCase();

        in.close();

        int[] count = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < word.length(); i++) {
            int temp = word.charAt(i) - 65;
            count[temp]++;

            if (max < count[temp]) {
                max = count[temp];
                result = word.charAt(i);
            } else if (max == count[temp]) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}