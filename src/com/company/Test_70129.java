package com.company;

public class Test_70129 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int zeroCount = 0;
        int binaryCount = 0;

        while (!s.equals("1")) {
            // 1. x의 모든 0 제거 (제거 개수 카운팅)
            for (int i = 0; i < s.length(); i++) {
                if (String.valueOf(s.charAt(i)).equals("0")) {
                    zeroCount++;
                }
            }
            // 0이 있는 경우에만 0 제거 처리
            if (s.contains("0")) {
                s = s.replaceAll("0", "");
            }

            // 2. x의 길이 C를 이진법 표현
            s = Integer.toBinaryString(s.length());
            binaryCount++;
        }
        answer[0] = binaryCount;
        answer[1] = zeroCount;

        return answer;
    }

    public static void main(String[] args) {
        Test_70129 obj = new Test_70129();

        String s = "110010101001";
        System.out.println(obj.solution(s));
    }
}