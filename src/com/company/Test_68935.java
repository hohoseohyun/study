package com.company;

public class Test_68935 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int leftPosition = 10;
        int rightPosition = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                leftPosition = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rightPosition = numbers[i];
            } else {
                int leftCal = calcPosition(leftPosition, numbers[i]);
                int rightCal = calcPosition(rightPosition, numbers[i]);

                if (leftCal < rightCal) {
                    answer += "L";
                    leftPosition = numbers[i];
                } else if (leftCal > rightCal) {
                    answer += "R";
                    rightPosition = numbers[i];
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightPosition = numbers[i];
                    } else {
                        answer += "L";
                        leftPosition = numbers[i];
                    }
                }
            }
        }
        return answer;
    }

    public int calcPosition(int index, int number) {
        index = index == 0 ? 11 : index;
        number = number == 0 ? 11 : number;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }

    public static void main(String[] args) {
        Test_68935 test = new Test_68935();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
// LRLLLRLLRRL
        test.solution(numbers, hand);
    }
}
