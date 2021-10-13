package Solution.String;

import java.util.Locale;
import java.util.Scanner;

public class FindCharacter {
    public void solution(){
        Scanner in = new Scanner(System.in);
        String[] inString = in.nextLine().toUpperCase(Locale.ROOT).split("");
        String target = in.nextLine().toUpperCase(Locale.ROOT);

        int result = 0;
        for(String str : inString){
            if(target.equals(str)) result++;
        }
        System.out.println(result);
    }
}
