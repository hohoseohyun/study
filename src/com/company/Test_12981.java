package com.company;

import java.util.ArrayList;

class Test_12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        ArrayList<String> test = new ArrayList<>();
        test.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!test.contains(words[i]) && test.get(test.size() - 1).substring(test.get(test.size() - 1).length() - 1).equals(words[i].substring(0, 1))) {
                test.add(words[i]);
            } else {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }

        return answer;
    }

    /*

     */
    public static void main(String[] args) {
        Test_12981 obj = new Test_12981();
        String[] words = {"qwe", "eqwe", "eqwe"};
        int n = 2;
        System.out.println(obj.solution(n, words));
    }
}