package com.company;

class Test_12924 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer += 1;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_12924 obj = new Test_12924();
        int n = 15;
        System.out.println(obj.solution(n));
    }
}