package Solution.Array;

import Solution.Common;

import java.util.Scanner;

public class MaxSum implements Common {
    /*
        N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] input = new int[size][size];
        int max = 0;

        for(int i = 0; i < size; i++){
            String[] temp = sc.nextLine().split(" ");
            int hrzSum = 0;
            for(int j = 0; j < size; j++){
                input[i][j] = Integer.parseInt(temp[j]);
                hrzSum += input[i][j];
            }
            max = max > hrzSum ? max : hrzSum;
        }

        int crossSum1 = 0;
        int crossSum2 = 0;

        for(int i = 0; i < size; i++) {
            int vcSum = 0;
            for (int j = 0; j < size; j++) {
                if(i == j){
                    crossSum1 += input[i][j];
                }
                if(i + j == size-1){
                    crossSum2 += input[i][j];
                }
                vcSum += input[j][i];
            }
            max = max > vcSum ? max : vcSum;
        }
        max = Math.max(max, crossSum1);
        max = Math.max(max, crossSum2);
        System.out.println(max);
    }
}
