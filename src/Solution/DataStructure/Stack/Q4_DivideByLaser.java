package Solution.DataStructure.Stack;

import Solution.Common;

import java.util.Scanner;
import java.util.Stack;

public class Q4_DivideByLaser implements Common {
    /*
    쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 주어졌을 때, 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성하시오.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        Stack<String> inStack = new Stack<>();
        int cnt = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i].equals("(")){
                if(input[i+1].equals(")")){
                    //laser
                    cnt += inStack.size();
                    i++;
                }else{
                    inStack.push(input[i]);
                }
            }else{
                inStack.pop();
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
