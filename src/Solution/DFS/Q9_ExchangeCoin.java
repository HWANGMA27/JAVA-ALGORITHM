package Solution.DFS;

import Solution.Common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
설명
다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
각 단위의 동전은 무한정 쓸 수 있다.

입력
첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.

압력 예시
3
1 2 5
15

타임아웃에 대한 최적화 방법
1. 현재기준 최저 동전 사용 수보다 커지면 중간에 멈춘다 (더 뻗어나가지 않는다)
2. 동전 종류 배열을 내림차순으로 정렬하여 숫자가 큰 동전부터 사용하게 한다.
   그래서 예측되는 min값을 최대한 낮춘 상태로 DFS를 실행하면 1번과 함께 시너지 효과를 발휘하여
   timout을 방지할 수 있다.

 */
public class Q9_ExchangeCoin implements Common {
    static Integer[] coin;
    static int minCnt = 500, size, target;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        coin = new Integer[size];
        for (int i = 0; i < size; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());
        target = sc.nextInt();
        DFS(0, 0);
        System.out.println(minCnt);
    }

    private static void DFS(int currentSum, int currentCnt) {
        if(currentCnt > minCnt || currentSum > target) return;

        if(currentSum == target){
            minCnt = Math.min(minCnt, currentCnt);
        }else {
            for (int i = 0; i < size; i++) {
               DFS(currentSum + coin[i], currentCnt+1);
            }
        }
    }
}
