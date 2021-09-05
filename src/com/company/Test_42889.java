package com.company;

import java.util.Arrays;
import java.util.Comparator;

class Test_42889 {
    public int[] solution(int n, int[] stages) {
        int[] clear = new int[n + 2];
        float[][] fail = new float[n][2];
        int[] answer = new int[n];
        int[] person = new int[n + 2];

        for (int i : stages) clear[i]++;

        person[0] = stages.length;
        for (int i = 1; i < n + 2; i++) {
            person[i] = person[i - 1] - clear[i - 1];
        }

        for (int i = 1; i < n + 1; i++) {
            if (person[i] == 0) fail[i - 1][0] = -1;
            else
                fail[i - 1][0] = clear[i] / (float) person[i];
            fail[i - 1][1] = i;
        }

        Arrays.sort(fail, new Comparator<float[]>() {
            @Override
            public int compare(float[] o1, float[] o2) {
                // TODO Auto-generated method stub
                if (o1[0] == o2[0]) return 0;
                return (o1[0] < o2[0]) ? 1 : -1;
            }
        });

        for (int i = 0; i < n; i++) {
            answer[i] = (int) fail[i][1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_42889 obj = new Test_42889();
        int N = 4;
        int[] stages = {4, 4, 4, 4, 4};
        System.out.println(obj.solution(N, stages));
    }
}