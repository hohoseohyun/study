package com.company;

class Test_42889 {
    public int[] solution(int N, int[] stages) {
        String[] tmp = new String[N];
        int[] answer = new int[N];

        int tryCount = 0;
        int fail = 0;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] > j) {
                    tryCount++;
                }
                if (stages[i] == j + 1) {
                    fail++;
                }
            }
            tmp[j] = String.valueOf(j + 1) + "/" + String.valueOf(fail * Math.pow(tryCount, -1));
            tryCount = 0;
            fail = 0;
        }

        String temp;
        for (int i = 0; i < tmp.length; i++) {
            for (int k = i; k < tmp.length; k++) {
                if (Double.valueOf(tmp[k].split("/")[1]) > Double.valueOf(tmp[i].split("/")[1])) {
                    temp = tmp[i];
                    tmp[i] = tmp[k];
                    tmp[k] = temp;
                }
                if (Double.valueOf(tmp[k].split("/")[1]).equals(Double.valueOf(tmp[i].split("/")[1]))) {
                    if (Double.valueOf(tmp[k].split("/")[0]) < Double.valueOf(tmp[i].split("/")[0])) {
                        temp = tmp[i];
                        tmp[i] = tmp[k];
                        tmp[k] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            answer[i] = Integer.valueOf(tmp[i].split("/")[0]);
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