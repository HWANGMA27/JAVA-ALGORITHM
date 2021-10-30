package Solution.String;

import java.util.Locale;
import java.util.Scanner;

public class VerifyPalindrome2 {
    public void verifyPalindrome2(){
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
}
