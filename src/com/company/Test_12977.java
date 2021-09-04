package com.company;

class Test_12977 {
    public int solution(int[] nums) {
        int answer = 0;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k]; //값을 담아
                    if (num >= 2) //경우의 수를 찾아서
                        tmp = check(num);
                    if (tmp == 2) //소수가 맞을 경우
                        answer++;
                }
            }
        }
        return answer;
    }

    public int check(int num) {
        int count = 0;

        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Test_12977 obj = new Test_12977();
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(obj.solution(nums));
    }
}