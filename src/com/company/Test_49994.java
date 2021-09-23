package com.company;

import java.util.HashSet;

class Test_49994 {
    public int solution(String dirs) {
        HashSet<String> set = new HashSet<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < dirs.length(); i++) {
            int nx = x;
            int ny = y;

            if (dirs.charAt(i) == 'U' && y + 1 <= 5) {
                y++;
            } else if (dirs.charAt(i) == 'D' && y - 1 >= -5) {
                y--;
            } else if (dirs.charAt(i) == 'R' && x + 1 <= 5) {
                x++;
            } else if (dirs.charAt(i) == 'L' && x - 1 >= -5) {
                x--;
            }
            if (nx == x && ny == y) {
                continue;
            }
            set.add(x + "" + y + "" + nx + "" + ny);
            set.add(nx + "" + ny + "" + x + "" + y);
        }
        return set.size() / 2;
    }

    public static void main(String[] args) {
        Test_49994 obj = new Test_49994();
        String dirs = "ULURRDLLU";
        System.out.println(obj.solution(dirs));
    }
}