package Solution.Recursive.Basic;

import Solution.Common;

import java.util.Scanner;

public class Q1_FactorialRecursive implements Common {
    /**
     * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요
     * 단 재귀함수를 이용할 것
     * 성능은 배열 >>>> 재귀(계속 트리형식으로 재호출)
     */
    int result = 1;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        recursive(i);
        System.out.println(result);
    }

    public void recursive(int n) {
        if(n == 0) return;
        else{
            recursive(n-1);
            result *= n;
        }
    }
}
