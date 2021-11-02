package Solution.Array;

import java.util.Scanner;

public class Fibonacci {
    /*
    1) 피보나키 수열을 출력한다.
    피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int[] prepArr = new int[45];
        prepArr[0] = 1;
        prepArr[1] = 1;

        for(int i=2; i<prepArr.length; i++){
            prepArr[i] = prepArr[i-1] + prepArr[i-2];
        }
        int input = sc.nextInt();
        for(int i=0; i<input; i++){
            System.out.print(prepArr[i] + " ");
        }
    }
}
