package Solution.DFS;

import Solution.Common;

import java.util.Scanner;

public class Subset implements Common {

    /**
     * 자연수 N이 주서지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하시오
     */
    boolean[] check;
    int input;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        check = new boolean[input+1];
        DFS(1);
    }

    public void DFS(int level){
        if (level == input+1){
            StringBuilder sb = new StringBuilder("");
            for (int i = 1; i < input + 1; i++) {
                if(check[i]){
                    sb.append(i);
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }else{
            check[level] = false;
            DFS(level+1);
            check[level] = true;
            DFS(level+1);
        }

    }
}
