package Solution.Hash;

import Solution.Common;

import java.util.*;

public class Q5_FindKthNumber implements Common {
    /*
        현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
        현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
        기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
        만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int[] input = new int[num];
        TreeSet<Integer> result = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i< num; i++){
            input[i] = sc.nextInt();
        }

        for (int i = 0; i< num; i++){
            for (int j = i+1; j< num; j++) {
                for (int k = j+1; k < num; k++) {
                    result.add(input[i]+input[j]+input[k]);
                }
            }
        }
        Integer[] temp = result.toArray(new Integer[result.size()]);
        System.out.println(temp[target-1]);
    }
}
