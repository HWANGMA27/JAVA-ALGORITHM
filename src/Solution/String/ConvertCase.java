package Solution.String;

import java.util.Locale;
import java.util.Scanner;

public class ConvertCase {
    /*
    대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
     */
    public void solution() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] inChar = input.toCharArray();
        StringBuilder result = new StringBuilder("");

        for (char ch : inChar) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(result);
    }
}
