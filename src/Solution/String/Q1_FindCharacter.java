package Solution.String;

import Solution.Common;

import java.util.Locale;
import java.util.Scanner;

public class Q1_FindCharacter implements Common {
    /*
    한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     */
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
