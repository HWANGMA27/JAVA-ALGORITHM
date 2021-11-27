package Solution.Sort;

import Solution.Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort implements Common {
    /*
    N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
    정렬하는 방법은 선택정렬입니다.
    선택 정렬(選擇整列, selection sort)은 제자리 정렬 알고리즘의 하나로, 다음과 같은 순서로 이루어진다.
    1. 주어진 리스트 중에 최소값을 찾는다.
    2. 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
    3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] input = new int[cnt];

        for(int i = 0; i < cnt; i++){
            input[i] = sc.nextInt();
        }
        for(int i = 0; i < cnt; i++){
            int min = input[i];
            int pos = 0;
            for(int j = i+1; j < cnt; j++) {
                if (min > input[j]) {
                    min = input[j];
                    pos = j;
                }
            }
            if(min != input[i]){
                int temp = input[i];
                input[i] = min;
                input[pos] = temp;
            }
        }
        for(int i = 0; i < cnt; i++){
            System.out.print(input[i] + " ");
        }
    }
}
