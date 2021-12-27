package Solution.DataStructure.Stack;

import Solution.Common;

import java.util.Scanner;
import java.util.Stack;

public class Q1_RightBrackets implements Common {
    /*
    괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
    (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        Stack<String> input = new Stack<>();
        String[] temp = sc.nextLine().split("");

        for(String bracket : temp){
            if(bracket.equals("(")){
                input.push(bracket);
            }else if(!input.isEmpty()){
                input.pop();
            }else{
                System.out.println("NO");
                return;
            }
        }
        if(input.isEmpty()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
