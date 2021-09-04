package com.company;

import java.util.*;

class Solution1 {
    ArrayList<String> result = new ArrayList<String>();
    String[][] originTickets;
    int count = 0;
    int index = 0;

    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];
        boolean[] visited = new boolean[tickets.length];
        originTickets = tickets;

        // String[][] ticket 두번째 인자 기준으로 sorting
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].toString().contentEquals(o2[0].toString()))
                    return o1[1].toString().compareTo(o2[1].toString());
                else
                    return o1[0].toString().compareTo(o2[0].toString());
            }
        });


        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals("ICN")) {
                for (int j = 0; j < tickets.length; j++) {
                    if (tickets[i][1].equals(tickets[j][0]) && tickets[j][1].equals("ICN") && count < 1) {
                        count++;
                        index = i;
                    }

                }
            }
        }

        bfs(tickets, "ICN", visited);

        if (result.size() == tickets.length + 1) {
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        } else {
            result = null;
            bfs(originTickets, "ICN", visited);
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        }
    }

    public boolean containList(String[][] tickets, String target) {
        ArrayList<String> tmp = new ArrayList<String>();
        // A
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(target)) {
                tmp.add(tickets[i][1]);
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            for (int j = 0; j < tickets.length; j++) {
                if (tickets[j][0].equals(tmp.get(i))) {
                    return true;
                } else if (result.size() == tickets.length) {
                    return true;
                }
            }
        }
        return false;
    }

    void bfs(String[][] tickets, String start, boolean[] visited) {
        Queue<String[]> q = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            // INC-O , O-INC 가 있다면 먼저 Queue에 넣도록 실행
            if (tickets[i][0].equals("ICN") && count > 0 && !visited[index]) {
                i = index;
                q.add(tickets[i]);
            }

            if (tickets[i][0].equals("ICN") && count == 0 && !visited[i] && containList(tickets, start)) {
                q.add(tickets[i]);
            }

            if (result.size() != 0 && start.equals(tickets[i][0]) && !visited[i] && containList(tickets, start)) {
                q.add(tickets[i]);
            }

            while (!q.isEmpty()) {
                String[] item = q.poll();
                if (!visited[i]) {
                    visited[i] = true;
                    result.add(item[0]);
                    count = 0;
                    bfs(tickets, item[1], visited);

// 마지막 티켓인 경우에는 종점도 추가
                    if (result.size() == tickets.length) {
                        result.add(item[1]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution1 obj = new Solution1();

        String[][] tickets = {{"ICN", "A"}, {"A", "C"}, {"A", "D"}, {"D", "B"}, {"B", "A"}};
        /*
T 1 : {{"ICN", "B"}, {"B", "ICN"}, {"ICN", "A"}, {"A", "D"}, {"D", "A"}}
ans : {"ICN", "B", "ICN", "A", "D", "A"}

//{{"ICN", "AAA"}, {"ICN", "AAA"}, {"ICN", "AAA"}, {"AAA", "ICN"}, {"AAA", "ICN"}}
["ICN", "AAA", "ICN", "AAA", "ICN", "AAA"]

[["ICN", "A"], ["ICN", "B"], ["B", "ICN"]]
 ["ICN", "B", "ICN", "A"]

 "ICN","A","D","B","A","C"
 */
        System.out.println(obj.solution(tickets));
    }
}