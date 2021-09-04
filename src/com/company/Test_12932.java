package com.company;

class Test_12932 {
    public int[] solution(long n) {
        String[] tmp = String.valueOf(n).split("");

        int[] answer = new int[tmp.length];

        for (int i = 0; i < tmp.length; i++) {
            answer[tmp.length - i - 1] = Integer.valueOf(tmp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_12932 obj = new Test_12932();
        long n = 12345;
        System.out.println(obj.solution(n));
    }
}