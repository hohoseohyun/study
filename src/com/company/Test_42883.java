package com.company;

// 그리디 탐색
// 입력값의 맨뒷자리 제외한 문자열에서 가장 큰 수를 찾는다.
class Test_42883 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int index = 0;
        int check = 0;

        for (int i = 0; i < number.length() - k; i++) {
            check = 0;
            for (int j = index; j <= i + k; j++) {
                if (check < number.charAt(j) - '0') {
                    check = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            answer.append(check);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Test_42883 obj = new Test_42883();
        String number = "1231234";
        int k = 3;
        System.out.println(obj.solution(number, k));
    }
}