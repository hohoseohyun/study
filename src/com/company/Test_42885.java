package com.company;

import java.util.Arrays;

class Test_42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int a = 0;
        int b = people.length - 1;
        Arrays.sort(people);

        while (a <= b) {
            // a + b 무게가 limit 보다 작은 경우
            if (people[a] + people[b] <= limit) {
                a++;
            }
            // limit 초과인 경우 무거운 사람 태우기
            b--;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_42885 obj = new Test_42885();
        int[] people = {70, 80, 50};
        int limit = 100;
        System.out.println(obj.solution(people, limit));
    }
}