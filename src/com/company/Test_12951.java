package com.company;

public class Test_12951 {
    public String solution(String s) {
        String[] test = s.toLowerCase().split(" ");

        for (int i = 0; i < test.length; i++) {
            if (!test[i].equals("")) {
                if (test[i].length() == 1) {
                    test[i] = test[i].substring(0, 1).toUpperCase();
                } else {
                    test[i] = test[i].substring(0, 1).toUpperCase() + test[i].substring(1);
                }
            }
        }
        String answer = String.join(" ", test);

        if (s.substring(s.length() - 1).equals(" ")) {
            answer += " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_12951 obj = new Test_12951();
        //" A  Sdf Fft " -> " A  sdf fFt "
        String s = " A  Sdf Fft ";
        System.out.println(obj.solution(s));
    }
}

