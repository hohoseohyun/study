package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [1152] 단어의 개수 (Java)
    Main
 */
public class Baek_1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        in.close();

        String[] test = s.split(" ");
        int count = 0;

        for (int i = 0; i < test.length; i++) {
            if (!test[i].equals("")) {
                count++;
            }
        }

        System.out.println(count);
    }
}