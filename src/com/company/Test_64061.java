package com.company;

import java.util.ArrayList;

public class Test_64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            int j = moves[i] - 1;
            boolean find = false;
            for (int k = 0; k < board[j].length; k++) {
                if (board[k][j] != 0 && !find) {

                    // 여기서 result 배열에서 이전 값과 현재 값이 같은 경우 중복 처리 사라지고 전체 count ++ 처리
                    if (result.size() > 0 && result.get(result.size() - 1) == board[k][j]) {
                        result.remove(result.size() - 1);
                        answer += 2;
                    } else {
                        result.add(board[k][j]);
                    }
                    board[k][j] = 0;
                    find = true;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_64061 obj = new Test_64061();

        /*
        [[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]] [1, 4, 5, 3, 5] 4
         */
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 4, 5, 3, 5};

        System.out.println(obj.solution(board, moves));
    }
}
