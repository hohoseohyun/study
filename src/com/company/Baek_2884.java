package com.company;

import java.util.Scanner;

//알람 시계
// 45분 일찍 알람 설정
public class Baek_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        in.close();

        if (m - 45 < 0) {
            m = 60 + m - 45;
            h = h == 0 ? 23 : h - 1;
        } else {
            m = m - 45;
        }

        System.out.println(h + " " + m);
    }
}
