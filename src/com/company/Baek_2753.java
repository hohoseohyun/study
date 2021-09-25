package com.company;

import java.util.Scanner;

//윤년
public class Baek_2753 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        in.close();

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("1");
            } else if (year % 100 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}
