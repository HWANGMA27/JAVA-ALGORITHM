package Solution.String;

import Solution.Common;

import java.util.Locale;
import java.util.Scanner;

public class Q3_FindWordInSentence implements Common {
    /*
    한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    문장속의 각 단어는 공백으로 구분됩니다.
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
