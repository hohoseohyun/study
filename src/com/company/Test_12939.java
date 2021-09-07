package com.company;

class Test_12939 {
    public String solution(String s) {
        String[] tmp = s.split(" ");

        int max = Integer.valueOf(tmp[0]);
        int min = Integer.valueOf(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            if (Integer.valueOf(tmp[i]) > max) {
                max = Integer.valueOf(tmp[i]);
            } else if (Integer.valueOf(tmp[i]) < min) {
                min = Integer.valueOf(tmp[i]);
            }
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        Test_12939 obj = new Test_12939();
        String s = "-1 -1";
        System.out.println(obj.solution(s));
    }
}