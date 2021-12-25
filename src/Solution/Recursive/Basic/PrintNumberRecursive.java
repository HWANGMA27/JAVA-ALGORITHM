package Solution.Recursive.Basic;

import Solution.Common;

import java.util.Scanner;

public class PrintNumberRecursive implements Common {

    /**
     * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하라
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        recursive(i);
    }

    public void recursive(int n){
        if(n == 0) return;
        else {
            recursive(n-1);
            System.out.print(n + " ");
        }
    }
}
