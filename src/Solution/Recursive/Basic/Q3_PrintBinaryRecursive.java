package Solution.Recursive.Basic;

import Solution.Common;

import java.util.Scanner;

public class Q3_PrintBinaryRecursive implements Common {
    /**
     * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
     * 단 재귀함수를 이용하여 출력해야합니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        recursive(i);
    }

    public void recursive(int n){
        int m = n/2; //몫
        int k = n%2; //나머지

        if(n == 0) return;
        else {
            recursive(m);
            System.out.print(k);
        }
    }
}
