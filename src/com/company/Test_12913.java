package com.company;

// dp 문제
class Test_12913 {
    int solution(int[][] land) {
        int answer = 0;

        int[][] dp = new int[land.length][land[0].length];

        // 처음 1열 저장
        for (int i = 0; i < land[0].length; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;
                    // 같은 인덱스가 아닌 값 제외하고 최댓값 저장
                    max = Math.max(max, dp[i - 1][k]);
                }
                dp[i][j] = land[i][j] + max;
            }
        }

        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, dp[land.length - 1][i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_12913 obj = new Test_12913();
        int[][] land = {{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}};
        System.out.println(obj.solution(land));
    }
}