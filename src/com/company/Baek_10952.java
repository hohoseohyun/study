package com.company;

import java.util.Scanner;

//A+B - 5
public class Baek_10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (num1 == 0 && num2 == 0) {
                in.close();
                break;
            }
            System.out.println(num1 + num2);
        }
    }
}
