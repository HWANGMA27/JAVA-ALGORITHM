package Solution.String;

import Solution.Common;

import java.util.Scanner;

public class Q4_ReverseWord implements Common {
    /*
    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     */
    public void solution(){
        Scanner in = new Scanner(System.in);
        int cnt = Integer.parseInt(in.nextLine());
        String[] arr = new String[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = in.nextLine();
        }
        for(String temp : arr){
            StringBuilder sb = new StringBuilder(temp);
            System.out.println(sb.reverse().toString());
        }
    }
}
