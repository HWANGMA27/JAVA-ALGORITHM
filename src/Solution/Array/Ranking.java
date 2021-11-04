package Solution.Array;

import Solution.Common;

import java.util.*;

public class Ranking implements Common {
    /*
        N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
        같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        int[] score = Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int[] ranking = new int[cnt];

        for(int i = 0; i < cnt; i++){
            int rank = 1;
            for(int j = 0; j < cnt; j++){
                if(i == j) continue;
                else if(score[j] > score[i]){
                    rank++;
                }
            }
            ranking[i] = rank;
        }
        for(int temp : ranking) {
            System.out.print(temp + " ");
        }
    }
}
