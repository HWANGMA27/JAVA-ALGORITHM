package Solution.SlidingWindow;

import Solution.Common;

import java.util.Scanner;

public class MaxSalesProfit implements Common {
    /*
        현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
        만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
        12 15 11 20 25 10 20 19 13 15
        연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int winSize = sc.nextInt();
        int[] target = new int[num];

        for(int i = 0; i< num; i++){
            target[i] = sc.nextInt();
        }
        int max = 0;
        int tempSum = 0;

        for(int i = 0; i < winSize; i++){
            max += target[i];
        }

        tempSum = max;

        for(int i = winSize; i <num; i++){
            tempSum += target[i] - target[i-winSize];
            max = max > tempSum ? max : tempSum;
        }
        System.out.println(max);
    }
}
