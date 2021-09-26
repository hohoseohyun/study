package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [10809] 알파벳 찾기 (Java)
    Main
 */
public class Baek_10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String input = in.next();

        in.close();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int result : arr) {
            System.out.print(result + " ");
        }
    }
}