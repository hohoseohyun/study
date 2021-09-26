package com.company;

import java.util.Scanner;

/*
    백준 - 문자열 / [2941] 크로아티아 알파벳 (Java)
    Main
 */
public class Baek_2941 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cro = in.next();

        in.close();
        
        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < word.length; i++) {
            if (cro.contains(word[i])) {
                cro = cro.replaceAll(word[i], "@");
            }
        }
        System.out.println(cro.length());
    }
}