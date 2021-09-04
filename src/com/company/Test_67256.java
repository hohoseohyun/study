package com.company;

class Test_67256 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        String left = "147";
        String right = "369";
        String mid = "2580";

        int leftSave = 0;
        int rightSave = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (left.contains(String.valueOf(numbers[i]))) {
                answer += "L";
                leftSave = numbers[i];
            } else if (right.contains(String.valueOf(numbers[i]))) {
                answer += "R";
                rightSave = numbers[i];
            } else {
                int tmpLeft = Math.abs(numbers[i] - leftSave);
                int tmpRight = Math.abs(numbers[i] - rightSave);

                if (tmpLeft == tmpRight) {
                    if (hand == left) {
                        answer += "L";
                        leftSave = numbers[i];
                    } else {
                        answer += "R";
                        rightSave = numbers[i];
                    }
                } else if (tmpLeft < tmpRight) {
                    answer += "L";
                    leftSave = numbers[i];
                } else {
                    answer += "R";
                    rightSave = numbers[i];
                }
            }
        }
        return answer;
    }

    //"LRLLLRLLRRL"
    public static void main(String[] args) {
        Test_67256 obj = new Test_67256();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(obj.solution(numbers, hand));
    }
}