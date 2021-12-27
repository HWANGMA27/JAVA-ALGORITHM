package Solution.Sort;

import Solution.Common;

import java.util.Scanner;

public class Q3_InsertionSort implements Common {
    /*
    N개인 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
    정렬하는 방법은 삽입정렬입니다.
    삽입 정렬(揷入整列, insertion sort)은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여,
    자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] input = new int[cnt];

        for(int i = 0; i < cnt; i++){
            input[i] = sc.nextInt();
        }

        for (int i = 1; i < cnt; i++){
            int target = input[i];
            int compare = i-1;
            while(compare >=0 && target < input[compare]){
                input[compare+1] = input[compare];
                compare--;
            }
            input[compare + 1] = target;
        }

        for(int i = 0; i < cnt; i++){
            System.out.print(input[i] + " ");
        }
    }
}
