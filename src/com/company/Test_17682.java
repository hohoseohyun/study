package com.company;

class Test_17682 {
    public int solution(String dartResult) {
        int answer = 0;

        String[] test = dartResult.split("");

        int num = -1;
        double[] result = new double[3];
        boolean checkTen = false;
        for (int i = 0; i < test.length; i++) {
            if (test[i].equals("S")) {
                result[num] = Math.pow(result[num], 1);
                checkTen = false;
            } else if (test[i].equals("D")) {
                result[num] = Math.pow(result[num], 2);
                checkTen = false;
            } else if (test[i].equals("T")) {
                result[num] = Math.pow(result[num], 3);
                checkTen = false;
            } else if (test[i].equals("*")) {
                if (num > 0) {
                    result[num - 1] = result[num - 1] * 2;
                }
                result[num] = result[num] * 2;
                checkTen = false;
            } else if (test[i].equals("#")) {
                result[num] = result[num] * -1;
                checkTen = false;
            } else {
                if (test[i + 1].matches("[0-9]")) {
                    checkTen = true;
                    num++;
                    result[num] = Double.valueOf(test[i] + test[i + 1]);
                } else if (!checkTen) {
                    num++;
                    result[num] = Double.valueOf(test[i]);
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            answer += result[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_17682 obj = new Test_17682();
        String dartResult = "10S1S10S";
        System.out.println(obj.solution(dartResult));
    }
}