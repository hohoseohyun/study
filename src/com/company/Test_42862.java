package com.company;

import java.util.Arrays;

class Test_42862 {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 같은 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_42862 obj = new Test_42862();

        int n = 10;
        int[] lost = {5, 7, 9};
        int[] reserve = {1, 2, 3, 4, 6, 8};
        System.out.println(obj.solution(n, lost, reserve));
    }
}