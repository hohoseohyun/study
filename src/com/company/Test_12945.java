package com.company;

class Test_12945 {
    public int solution(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            int c = (a + b) % 1234567;
            a = b % 1234567;
            b = c % 1234567;
        }
        return a;
    }

    public static void main(String[] args) {
        Test_12945 obj = new Test_12945();
        int n = 5;
        System.out.println(obj.solution(n));
    }
}