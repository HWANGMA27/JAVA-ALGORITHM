package Solution.TwoPointers;

import Solution.Common;

import java.util.Scanner;

public class CombineNumbers implements Common {
    /*
        N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
        만약 N=15이면
        7+8=15
        4+5+6=15
        1+2+3+4+5=15
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int limit = number/2;
        int cnt = 0;

        for(int i = 1; i< limit+1; i++){
            int tempSum = 0;
            int tempVar = i;
            while(tempSum < number){
                tempSum += tempVar++;
            }
            if(tempSum == number) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
