package Solution.Hash;

import Solution.Common;

import java.util.*;

public class Q3_CntSalesKind implements Common {
    /*
        현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
        각 구간별로 구하라고 했습니다.

        만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
        20 12 20 10 23 17 10
        각 연속 4일간의 구간의 매출종류는
        첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
        두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
        세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
        네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.

        N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
        매출액의 종류를 출력하는 프로그램을 작성하세요.
     */
    /*
        단순히 2중 포문을 사용한 풀이로 범위가 커지면 time out이 발생한다.
     */
    public void solution2() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int targetSize = sc.nextInt();
        int[] input = new int[size];

        for(int i = 0; i< size; i++){
            input[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i< size-targetSize+1; i++){
            Set<Integer> kinds = new HashSet();
            for(int j = i; j< i+targetSize; j++){
                kinds.add(input[j]);
            }
            System.out.print(kinds.size() + " ");
        }
    }
    /*
        HashMap과 Sliding Window를 같이 사용한 풀이
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int windowSize = sc.nextInt();
        int[] input = new int[size];

        for(int i = 0; i< size; i++){
            input[i] = sc.nextInt();
        }

        int result = 0, lt = 0;
        Map<Integer, Integer> salesCnt = new HashMap<>();
        //초기값 세팅
        for(int i = 0; i< windowSize-1; i++){
            salesCnt.put(input[i], salesCnt.getOrDefault(input[i], 0) + 1);
        }
        for(int rt = windowSize-1; rt < size; rt++){
            if(lt != 0 && salesCnt.get(input[lt-1]) == 1){
                salesCnt.remove(input[lt-1]);
            }else if(lt != 0){
                salesCnt.put(input[lt-1], salesCnt.get(input[lt-1]) -1);
            }
            lt++;
            salesCnt.put(input[rt], salesCnt.getOrDefault(input[rt], 0) +1);
            System.out.print(salesCnt.size() + " ");
        }
    }
}
