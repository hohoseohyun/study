package com.company;

import java.io.*;

/*
    백준 - 정렬 / [10989] 수 정렬하기 3 (Java)
    Arrays.sort() 사용하면 시간 초과
    Collections.sort() 사용하면 시간 초과
    count Sort 처리
    Main
 */
public class Baek_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            count[input]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append(i + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}