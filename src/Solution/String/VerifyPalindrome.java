package Solution.String;

import java.util.Locale;
import java.util.Scanner;

public class VerifyPalindrome {
    /*
    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
     */
    public void solution(){
        Scanner sc = new Scanner(System.in);
        StringBuffer input = new StringBuffer(sc.nextLine().toUpperCase(Locale.ROOT));
        StringBuffer revese = new StringBuffer(input).reverse();
        if(input.toString().equals(revese.toString())) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
