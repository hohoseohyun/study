package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    백준 - DFS & BFS / [2606] 바이러스 (Java)
    Main
 */
public class Baek_2606 {
    public static int[][] arr;
    public static boolean[] visited;
    public static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int V = 1;

        arr = new int[N + 1][N + 1];

        for (int i = 1; i <= M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        in.close();

        visited = new boolean[N + 1];

        bfs(V);

        System.out.println(count);
    }

    // 너비 우선 방식
    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int temp = q.peek();
            q.poll();
            for (int i = 1; i < arr.length; i++) {
                if (arr[temp][i] == 1 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }
}