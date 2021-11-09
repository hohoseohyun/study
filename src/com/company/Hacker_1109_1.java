package com.company;

public class Hacker_1109_1 {
    public int[] solution(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int check = 5 - list[i] % 5;
            if (check < 3 && (list[i] + check > 40)) {
                result[i] = list[i] + check;
            } else {
                result[i] = list[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Hacker_1109_1 obj = new Hacker_1109_1();

        int[] list = {73, 67, 38, 33};
        System.out.println(obj.solution(list));
    }
}
