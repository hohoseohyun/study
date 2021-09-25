package com.company;

import java.util.Scanner;

//더하기 사이클
public class Baek_1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        in.close();

        int count = 0;
        int temp = num;

        while (true) {
            temp = ((temp % 10) * 10) + (((temp / 10) + (temp % 10)) % 10);
            count++;

            if (num == temp) {
                break;
            }
        }
        System.out.println(count);
    }
}
