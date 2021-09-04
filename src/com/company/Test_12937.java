package com.company;

class Test_12937 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Test_12937 obj = new Test_12937();
        int num = 0;
        System.out.println(obj.solution(num));
    }
}