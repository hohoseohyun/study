package com.company;

class Test_12926 {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char change = s.charAt(i);

            if (change >= 'a' && change <= 'z') {
                if (change + n > 'z') answer += (char) (change + n - 26);
                else answer += (char) (change + n);
            } else if (change >= 'A' && change <= 'Z') {
                if (change + n > 'Z') answer += (char) (change + n - 26);
                else answer += (char) (change + n);
            } else answer += (char) change;

        }
        return answer;
    }

    public static void main(String[] args) {
        Test_12926 obj = new Test_12926();

        String s = "a B z";
        int n = 4;
        System.out.println(obj.solution(s, n));
    }
}