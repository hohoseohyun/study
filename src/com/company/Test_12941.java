package com.company;

import java.util.Arrays;

class Test_12941 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        if (Arrays.stream(A).max().getAsInt() < Arrays.stream(B).max().getAsInt()) {
            for (int i = 0; i < A.length; i++) {
                answer += A[i] * B[B.length - i - 1];
            }
        } else {
            for (int i = 0; i < A.length; i++) {
                answer += B[i] * A[A.length - i - 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_12941 obj = new Test_12941();
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println(obj.solution(A, B));
    }
}