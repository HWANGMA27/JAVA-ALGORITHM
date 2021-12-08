package Solution.DataStructure.Stack;

import Solution.Common;

import java.util.Scanner;
import java.util.Stack;

public class RemoveCharInsideBracket implements Common {
    /*
    입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        Stack<String> input = new Stack<>();
        String[] temp = sc.nextLine().split("");
        StringBuilder sb = new StringBuilder();

        for(String ch : temp){
            if(ch.equals(")")){
                while(!input.peek().equals("(")){
                    input.pop();
                }
                input.pop();
            }else{
                input.push(ch);
            }
        }
        while(!input.isEmpty()){
            sb.append(input.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
