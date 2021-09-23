package com.company;

import java.util.PriorityQueue;

class Test_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // queue에 넣기
        for (int i = 0; i < scoville.length; i++) {
            heap.add(scoville[i]);
        }

        // 최소값이 K보다 작은 경우
        while (heap.peek() < K) {
            // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
            if (heap.size() <= 1) {
                return -1;
            }
            // 최소값 2개 가져오기
            int min1 = heap.poll();
            int min2 = heap.poll();

            // 스코빌 지수 만들기
            heap.add(min1 + (min2 * 2));
            // 횟수 카운팅
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_42626 obj = new Test_42626();
        int[] scoville = {1, 2};
        int K = 11;
        System.out.println(obj.solution(scoville, K));
    }
}