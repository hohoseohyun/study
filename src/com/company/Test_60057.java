package com.company;

public class Test_60057 {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        if (s.length() == 1) return 1;
        // 문자열 기준 1~length 까지
        for (int i = 1; i < s.length(); i++) {
            String now = "";
            String comp = "";
            String temp = "";
            int cnt = 1;

            for (int j = 0; j <= s.length() / i; j++) {
                int from = i * j;
                int to = i * (j + 1);
                // 값 넘을 시 보정
                if (to > s.length()) to = s.length();

                // 기준점 변경
                now = comp;
                comp = s.substring(from, to);

                // 비교
                if (now.equals(comp)) cnt++;
                else {
                    if (cnt > 1) temp += String.valueOf(cnt);
                    temp += now;
                    cnt = 1; // 개수 초기화
                }
            }
            // 남은값 처리
            if (cnt > 1) temp += String.valueOf(cnt);
            temp += comp;
            // 갱신
            answer = Math.min(temp.length(), answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_60057 obj = new Test_60057();
        String s = "ababcdcdababcdcd";
        // aabbaccc => 2a2ba3c
        // ababcdcdababcdcd => 2ababcdcd
        System.out.println(obj.solution(s));
    }
}
