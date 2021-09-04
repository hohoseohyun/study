package com.company;

class Test_12954 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_12954 obj = new Test_12954();
        int x = 0;
        int n = 2;
        System.out.println(obj.solution(x, n));
    }
}