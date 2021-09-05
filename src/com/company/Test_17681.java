package com.company;

public class Test_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        // n번씩 돌면서 arr1, arr2 계산
        for (int k = 0; k < n; k++) {
            // 이진수로 변경해주기
            String[] arr1B = changeBinary(arr1[k], n).split("");
            String[] arr2B = changeBinary(arr2[k], n).split("");

            // 값 비교 해서 "#", " " 추출하기
            String result = "";
            for (int i = 0; i < n; i++) {
                // 각 자릿수의 이진수 값이 0보다 큰 경우 "#" 처리
                if (Integer.parseInt(arr1B[i]) + Integer.parseInt(arr2B[i]) > 0) {
                    result += "#";
                } else {
                    result += " ";
                }
            }
            answer[k] = result;
        }
        return answer;
    }

    // 이진수로 변경 후 자릿수 맞추기 위해서 0 추가
    public String changeBinary(int number, int n) {
        String binaryNumber = Integer.toBinaryString(number);
        if (binaryNumber.length() < n) {
            String addZero = "";
            for (int i = 0; i < n - binaryNumber.length(); i++) {
                addZero += "0";
            }
            binaryNumber = addZero + binaryNumber;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        Test_17681 obj = new Test_17681();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        // ["#####","# # #", "### #", "# ##", "#####"]
        System.out.println(obj.solution(n, arr1, arr2));
    }
}