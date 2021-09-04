package com.company;

class Test_12948 {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length() - 4;

        String change = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            change += "*";
        }
        answer = phone_number.replace(phone_number.substring(0, length), change);
        return answer;
    }

    public static void main(String[] args) {
        Test_12948 obj = new Test_12948();
        String phone_number = "027778888";
        System.out.println(obj.solution(phone_number));
    }
}