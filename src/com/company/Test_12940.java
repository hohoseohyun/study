package com.company;

class Test_12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];

        return answer;
    }

    // 최대 공약수
    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Test_12940 obj = new Test_12940();

        int n = 1;
        int m = 1;
        System.out.println(obj.solution(n, m));
    }
}