package Solution.Recursive.Basic;

import Solution.Common;

import java.util.Scanner;

public class FibonacciRecursive implements Common {
    /**
     * 자연수 N이 입력되면 피보나치 수열을 N개만큼 출력하는 프로그램을 작성하라
     * 단 재귀함수를 활용해서 작성(메모리제이션)
     */
    int[] arr;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        arr = new int[i];
        recursive(0, i);
        for (int temp : arr){
            System.out.print(temp + " ");
        }
    }

    public void recursive(int init, int max) {
        if(init == max){
            return;
        }else{
            if (init == 0 || init == 1) arr[init] = 1;
            else{
                arr[init] = arr[init-1] + arr[init-2];
            }
            recursive(init+1, max);
        }
    }
}
