package com.company;

import java.util.ArrayList;

class Test_1845 {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!test.contains(nums[i])) {
                test.add(nums[i]);
            }
        }
        answer = test.size() >= nums.length / 2 ? nums.length / 2 : test.size();
        return answer;
    }

    public static void main(String[] args) {
        Test_1845 obj = new Test_1845();
        int[] nums = {3,3,3,2,2,2};
        System.out.println(obj.solution(nums));
    }
}