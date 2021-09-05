package com.company;

public class Test_84325 {
    public String solution(String[] table, String[] languages, int[] preference) {
        int[] answer = new int[table.length];

        // 각 table 마다 최종 점수 계산
        for (int i = 0; i < table.length; i++) {
            String[] index = table[i].split(" ");
            int resultScore = 0;
            for (int l = 0; l < languages.length; l++) {
                for (int j = 0; j < index.length; j++) {
                    if (languages[l].equals(index[j])) {
                        resultScore += preference[l] * (index.length - j);
                    }
                }
                answer[i] = resultScore;
            }
        }

        int maxScore = 0;
        int index = 0;

        // 최고 점수인 경우 확인
        for (int i = 0; i < answer.length; i++) {
            if (maxScore < answer[i]) {
                maxScore = answer[i];
                index = i;
                // 최고 점수와 같은 경우 사전순으로 비교하여 넣기
            } else if (maxScore == answer[i]) {
                if (table[index].split(" ")[0].compareTo(table[i].split(" ")[0]) > 0) {
                    index = i;
                }
            }
        }
        return table[index].split(" ")[0];
    }

    public static void main(String[] args) {
        Test_84325 obj = new Test_84325();
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"JAVA", "JAVASCRIPT"};
        int[] preference = {7, 5};

        System.out.println(obj.solution(table, languages, preference));
    }
}
