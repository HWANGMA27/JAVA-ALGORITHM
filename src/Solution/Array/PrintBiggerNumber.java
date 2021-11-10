package Solution.Array;

import Solution.Common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PrintBiggerNumber implements Common {
    /*
    N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     */
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");

        //primitive type을 이용한 이유는 기본값이 false이기 때문
        boolean[] isBigger = new boolean[input.length];
        isBigger[0] = true;

        for(int i = 1; i<input.length; i++){
            int target = Integer.parseInt(input[i-1]);
            int temp = Integer.parseInt(input[i]);
            if(target < temp){
                isBigger[i] = true;
            }
        }

        for(int i = 0; i < isBigger.length; i++){
            if(isBigger[i]){
                System.out.print(input[i]);
                System.out.print(" ");
            }
        }
    }
}
