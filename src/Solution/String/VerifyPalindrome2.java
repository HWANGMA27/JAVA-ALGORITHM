package Solution.String;

import java.util.Locale;
import java.util.Scanner;

public class VerifyPalindrome2 {
    /*
    문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
    알파벳 이외의 문자들의 무시합니다.
     */
    public void solution(){
        //Using ascii code
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char temp  : input){
            int ascii = (int) temp;
            if(ascii > 64 && ascii <91 ||ascii > 96 && ascii <123){
                sb.append(temp);
;            }
        }
        StringBuffer org = new StringBuffer(sb.toString().toUpperCase(Locale.ROOT));
        StringBuffer revese = new StringBuffer(org).reverse();
        if(org.toString().equals(revese.toString())) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public void solution2(){
        //Using regular expression
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp  = new StringBuilder(input).reverse().toString();
        if(input.equals(tmp)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
