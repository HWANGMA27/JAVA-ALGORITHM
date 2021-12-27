package Solution.String;

import Solution.Common;

import java.util.Scanner;
import java.util.Stack;

public class Q11_CompressWord implements Common {
    /*
        알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
        문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
        단 반복횟수가 1인 경우 생략합니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input.charAt(0));
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<input.length(); i++){
            if(!stack.isEmpty() && input.charAt(i) != stack.peek()){
                int cnt = 0;
                char target = stack.peek();
                while(!stack.isEmpty()){
                    stack.pop();
                    cnt++;
                }
                sb.append(target);
                if(cnt >1){
                    sb.append(cnt);
                }
            }
            stack.push(input.charAt(i));
        }
        if(!stack.isEmpty()) {
            int cnt = 0;
            char target = stack.peek();
            while (!stack.isEmpty()) {
                stack.pop();
                cnt++;
            }
            sb.append(target);
            if (cnt > 1) {
                sb.append(cnt);
            }
        }
        System.out.println(sb.toString());
    }
}
