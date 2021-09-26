package com.company;

import java.util.HashMap;
import java.util.Scanner;

/*
    백준 - 문자열 / [1316] 그룹 단어 체커 (Java)
    Main
 */
public class Baek_1316 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.next();
        }

        in.close();

        int word = 0;

        for (int i = 0; i < arr.length; i++) {
            HashMap<Character, Integer> test = new HashMap<>();
            boolean check = true;
            for (int j = 0; j < arr[i].length(); j++) {
                if (test.containsKey(arr[i].charAt(j))) {
                    int value = test.get(arr[i].charAt(j)).intValue();
                    if (Math.abs(value - j) < 2) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
                test.put(arr[i].charAt(j), j);
            }
            word += check ? 1 : 0;
        }
        System.out.println(word);
    }
}