package Solution.Sort;

import Solution.Common;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_DecisionAlgorithm2 implements Common {
    /*
    설명
    N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
    현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
    가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
    C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int stallSize = sc.nextInt();
        int horse = sc.nextInt();
        int[] input = new int[stallSize];
        int result = 0;
        for (int i = 0; i< input.length; i++){
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);

        int lt, rt, mid;
        rt = input[stallSize-1];
        lt = 1;

        while(rt >= lt){
            mid = (lt + rt) / 2;
            if(possibleHorse(input, mid) >= horse){
                lt = mid+1;
                result = mid;
            }else{
                rt = mid-1;
            }
        }
        System.out.println(result);
    }
    public static int possibleHorse(int[] input, int dist){
        int tempHorse = 1;
        int ep = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] - ep >= dist){
                tempHorse++;
                ep = input[i];
            }
        }
        return tempHorse;
    }
}
