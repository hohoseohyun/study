package com.company;

class Test_12911 {
    public int solution(int n) {
        int answer = 0;
        int nToBinary = Integer.bitCount(n);

        for (int i = n + 1; i <= 1000000; i++) {
            if (Integer.bitCount(i) == nToBinary) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_12911 obj = new Test_12911();
        int n = 78;
        System.out.println(obj.solution(n));
    }
}