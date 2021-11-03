package Solution.Array;

import java.util.Scanner;

public class Eratosthenes {
    /*
    자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    만약 20이 입력되면 1부터 20까지의 소수는
    2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt()+1;
        boolean[] prepArr = new boolean[input];

        //false 소수 true 소수 x
        for(int i = 2; i <= input/2; i++){
            for(int j = i*2; j < input; j+=i){
                if(prepArr[j]) continue;
                prepArr[j] = true;
            }
        }
        int cnt = 0;
        for(int i = 2; i < input; i++){
            if(!prepArr[i]) cnt ++;
        }
        System.out.println(cnt);
    }

    /*
        solution으로 200,000만큼 소수배열을 만들고 시작하려햇으나 runtime에러가 발생했다.
        solution2는 강의 풀이
     */
    public void solution2() {

    }
}
