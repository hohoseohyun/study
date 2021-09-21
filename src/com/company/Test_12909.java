package com.company;

class Test_12909 {
    boolean solution(String s) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')' && i == 0) {
                return false;
            } else if (s.charAt(i) == ')') {
                close++;
            }

            if (close > open) {
                return false;
            }
        }

        return open == close ? true : false;
    }

    public static void main(String[] args) {
        Test_12909 obj = new Test_12909();
        String s = "()))((()";
        System.out.println(obj.solution(s));
    }
}