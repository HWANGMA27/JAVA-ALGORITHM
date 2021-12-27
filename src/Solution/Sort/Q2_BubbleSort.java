package Solution.Sort;

import Solution.Common;

import java.util.Scanner;

public class Q2_BubbleSort implements Common {
    /*
    N개인 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
    정렬하는 방법은 버블 정렬입니다.
    거품 정렬 또는 버블 정렬( - 整列, 영어: bubble sort, sinking sort)은 두 인접한 원소를 검사하여 정렬하는 방법이다.
    시간 복잡도가 O(n^{2})로 상당히 느리지만, 코드가 단순하기 때문에 자주 사용된다.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] input = new int[cnt];

        for(int i = 0; i < cnt; i++){
            input[i] = sc.nextInt();
        }
        int change = 1;
        while(change > 0){
            change = 0;
            for(int i = 0; i < cnt-1; i++) {
                if(input[i] > input[i+1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    change++;
                }
            }
        }

        for(int i = 0; i < cnt; i++){
            System.out.print(input[i] + " ");
        }
    }
}
