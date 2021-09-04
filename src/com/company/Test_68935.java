package com.company;

import java.util.Arrays;

public class Test_68935 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
// L -> * R -> #
// 1,4,7 -> L
// 3,6,9 -> R
// 2,5,8,0 계산
        String[] result = new String[numbers.length];

        String now = "";
        int leftPosition = 0;
        int rightPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                result[i] = "L";
                now = "L";
                leftPosition = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                result[i] = "R";
                now = "R";
                rightPosition = numbers[i];
            } else {
                int check = numbers[i] % 3;
                if (check - leftPosition % 3 < check - rightPosition % 3) {
                    result[i] = "L";
                    now = "L";
                    leftPosition = numbers[i];
                } else if (check - leftPosition % 3 > check - rightPosition % 3) {
                    result[i] = "R";
                    now = "R";
                    rightPosition = numbers[i];
                } else {
                    result[i] = now;
                }
            }
        }
        return Arrays.stream(result).toString();
    }

    public static void main(String[] args) {
        Test_68935 test = new Test_68935();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
// LRLLLRLLRRL
        test.solution(numbers, hand);
    }
}
