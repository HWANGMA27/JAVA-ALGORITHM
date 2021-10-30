package Solution.String;

import java.util.Locale;
import java.util.Scanner;

public class VerifyPalindrome {
    public void verifyPalindrome(){
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
