package Solution.String;

import java.util.Locale;
import java.util.Scanner;

public class ConvertCase {
    public void Solution() {
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
