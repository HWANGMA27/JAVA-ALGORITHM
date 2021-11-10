package Solution.Array;

import Solution.Common;

import java.util.Scanner;

public class PickLeader implements Common {
    /*
        그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
        각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        boolean cnt[][] = new boolean[size][size];
        int grade = 5;
        int arr[][] = new int[size][grade];

        //입력 값 저장
        for(int i = 0; i< size; i++){
            String[] temp = sc.nextLine().split(" ");
            for (int j = 0; j< grade; j++){
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        //같은반이 된적 있으면 flag true처리
        for(int i = 0; i< size; i++){
            for (int j = 0; j< size; j++){
                if(i != j) {
                    for (int k = 0; k < grade; k++) {
                        if (arr[i][k] == arr[j][k]) {
                            cnt[i][j] = true;
                        }
                    }
                }
            }
        }
        int result[] = new int[size];
        int i = 0;
        int max = 0;
        //학생별 만난 횟수와 가장 많이 만난 횟수 산정
        for(boolean[] temp : cnt){
            for (boolean temp2 : temp){
                if(temp2) result[i]++;
            }
            max = max > result[i] ? max : result[i];
            i++;
        }

        for(int std = 0; std< size; std++){
            if(result[std] == max){
                System.out.println(std+1);
                break;
            }
        }
    }
}
