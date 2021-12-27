package Solution.SlidingWindow;

import Solution.Common;

import java.util.Scanner;

public class Q2_Subsequence implements Common {
    /*
        N개의 수로 이루어진 수열이 주어집니다.
        이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
        만약 N=8, M=6이고 수열이 다음과 같다면
        1 2 1 3 1 1 1 2
        합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int[] input = new int[num];
        int cnt = 0;

        for(int i = 0; i< num; i++){
            input[i] = sc.nextInt();
        }

        for(int i = 0; i< num; i++){
            int tempSum = 0;
            int temp = i;
            while(temp < num && tempSum < target){
                tempSum += input[temp];
                if(tempSum == target) {
                    cnt++;
                    break;
                }
                temp++;
            }
        }
        System.out.println(cnt);
    }

    /*
        Two pointer & Sliding window 알고리즘을 적용해서 풀이
     */
    public void solution2() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int[] input = new int[num];
        int cnt = 0;

        for(int i = 0; i< num; i++){
            input[i] = sc.nextInt();
        }

        int lt = 0, tempSum = 0;

        for(int rt = 0;rt< num; rt++){
            tempSum += input[rt];
            if(tempSum == target) cnt ++;
            while(tempSum >= target){
                tempSum -= input[lt++];
                if(tempSum == target) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
