package com.company;

class Test_17687 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String temp = "";
        int count = 0;

        while (temp.length() < (t * m + p)) {
            String result = "";
            int num = count++;
            // n진법 표현
            while (num != 0) {
                if (num % n >= 10) {
                    // 10 이상인 경우 A-F 표시
                    result += String.valueOf((char) (num % n + 55));
                } else {
                    result += String.valueOf(num % n);
                }
                num /= n;
            }
            // 거꾸로 뒤집어서 저장
            temp += new StringBuffer(result).reverse().toString();
        }

        for (int i = 0; i < t; i++) {
            answer += String.valueOf(temp.charAt(m * i + p - 1));
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_17687 obj = new Test_17687();
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        System.out.println(obj.solution(n, t, m, p));
    }
}