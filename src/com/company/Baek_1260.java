package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    백준 - DFS & BFS / [1260] DFS와 BFS (Java)
    Main
 */
public class Baek_1260 {
    public static int[][] arr;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int V = in.nextInt();

        arr = new int[N + 1][N + 1];

        for (int i = 1; i <= M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }


        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
        System.out.println();

        in.close();
    }

    // 깊이 우선 방식
    public static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");

        if (start == arr.length) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            // 연결되어져 있고 방문하지 않았다면 방문
            if (arr[start][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }


    }

    // 너비 우선 방식
    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visited[start] = true;
        System.out.print(start + " ");

        while (!q.isEmpty()) {
            int temp = q.peek();
            q.poll();
            for (int i = 1; i < arr.length; i++) {
                if (arr[temp][i] == 1 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}