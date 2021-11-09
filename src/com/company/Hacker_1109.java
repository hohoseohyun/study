package com.company;

public class Hacker_1109 {
    public String solution(String s) {
        String check = s.substring(8, 10);

        int hour = Integer.valueOf(s.substring(0, 2));
        String min = s.substring(2, 8);

        String result = "";

        if (check.equals("PM")) {
            result = hour < 12 ? String.valueOf(hour + 12) + min : String.valueOf(hour) + min;
        } else {
            result = hour == 12 ? "00" + min : s.substring(0, 8);
        }
        return result;
    }

    public static void main(String[] args) {
        Hacker_1109 obj = new Hacker_1109();

        String s = "07:05:45PM";
        System.out.println(obj.solution(s));
    }
}
