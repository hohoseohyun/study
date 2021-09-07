package com.company;

public class Test_12953 {
    public int solution(int[] arr) {
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tmp = tmp > arr[i] ? tmp * arr[i] / gcd(arr[i], tmp) : tmp * arr[i] / gcd(tmp, arr[i]);
        }
        return tmp;
    }

    //  최대 공약수 구하기
    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Test_12953 obj = new Test_12953();
        int[] arr = {1, 2, 3};
        System.out.println(obj.solution(arr));
    }
}
