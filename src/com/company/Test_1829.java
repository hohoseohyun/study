package com.company;

public class Test_1829 {

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[][] isVisited = new int[picture.length][picture[0].length];

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                int area = area(picture, isVisited, i, j);
                if (area > 0) {
                    numberOfArea++;
                    maxSizeOfOneArea = maxSizeOfOneArea < area ? area : maxSizeOfOneArea;
                }

            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    // dfs
    public int area(int[][] picture, int[][] isVisited, int i, int j) {
        if (picture[i][j] == 0) {
            return 0;
        }
        if (isVisited[i][j]++ > 0) {
            return 0;
        }
        int result = 1;
        if (i + 1 != picture.length) {
            // 사방 다 체크
            if (picture[i + 1][j] == picture[i][j]) {
                result += area(picture, isVisited, i + 1, j);
            }
        }
        if (j + 1 != picture[0].length) {
            // 사방 다 체크
            if (picture[i][j + 1] == picture[i][j]) {
                result += area(picture, isVisited, i, j + 1);
            }
        }
        if (i - 1 >= 0) {
            // 사방 다 체크
            if (picture[i - 1][j] == picture[i][j]) {
                result += area(picture, isVisited, i - 1, j);
            }
        }
        if (j - 1 >= 0) {
            // 사방 다 체크
            if (picture[i][j - 1] == picture[i][j]) {
                result += area(picture, isVisited, i, j - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Test_1829 obj = new Test_1829();
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        System.out.println(obj.solution(m, n, picture));
    }
}
