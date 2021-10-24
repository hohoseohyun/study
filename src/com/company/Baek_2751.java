package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    백준 - 정렬 / [2751] 수 정렬하기 2 (Java)
    Arrays.sort() 사용하면 시간 초과
    자바에서 그나마 성능이 좋은 TimeSort 사용하는 Collection 을 이용한 sort 처리
    Main
 */
public class Baek_2751 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) list.add(in.nextInt());

        Collections.sort(list);

        for (Integer i : list) sb.append(i).append('\n');

        System.out.println(sb);
    }
}