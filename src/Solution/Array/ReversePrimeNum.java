package Solution.Array;

import Solution.Common;

import java.util.Arrays;
import java.util.Scanner;

public class ReversePrimeNum implements Common {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100000;
        boolean[] prepArr = new boolean[MAX];

        //false 소수 true 소수 x
        for(int i = 2; i <= MAX/2; i++){
            for(int j = i*2; j < MAX; j+=i){
                if(prepArr[j]) continue;
                prepArr[j] = true;
            }
        }

        int input = Integer.parseInt(sc.nextLine());
        String[] primeArr = sc.nextLine().split(" ");
        //reverse input num
        for(int i=0; i<primeArr.length; i++){
            StringBuilder sb = new StringBuilder(primeArr[i]).reverse();
            int prime = Integer.parseInt(sb.toString());
            if(prime > 1 && !prepArr[prime]){
                System.out.print(prime + " ");
            }
        }
    }
}
