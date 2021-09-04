package com.company;

import java.util.Arrays;
import java.util.Collections;

class Test_12933 {
    public long solution(long n) {
        String answer = "";
        String[] tmp = String.valueOf(n).split("");
        Arrays.sort(tmp, Collections.reverseOrder());

        for (int i = 0; i < tmp.length; i++) {
            answer += tmp[i];
        }
        return Long.valueOf(answer);
    }

    public static void main(String[] args) {
        Test_12933 obj = new Test_12933();
        long n = 118372;
        System.out.println(obj.solution(n));
    }
}