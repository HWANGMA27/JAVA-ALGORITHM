package Solution.String;

import Solution.Common;

import java.util.Locale;
import java.util.Scanner;

public class ExtractNumber implements Common {
    /*
    문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
    자연수임으로 맨앞에 0이 나올경우 0은 출력하지 않는다
     */
    public void solution(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("[^0-9]", "");
        char[] temp = input.toCharArray();
        int startPoint = 0;
        for(int i=0; i<input.length(); i++){
            if(temp[i] != '0'){
                startPoint = i;
                break;
            }
        }
        System.out.println(input.substring(startPoint, input.length()));
    }
}
