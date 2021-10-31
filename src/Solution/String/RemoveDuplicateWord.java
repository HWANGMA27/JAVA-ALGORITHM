package Solution.String;

import java.util.*;

public class RemoveDuplicateWord {
    /*
    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
     */
    public void solution(){
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        Set<Character> word = new LinkedHashSet<>();

        for(char temp : input){
            word.add(temp);
        }

        Iterator<Character> it = word.iterator();
        StringBuilder sb = new StringBuilder("");
        while(it.hasNext()){
            sb.append(it.next());
        }
        System.out.println(sb.toString());
    }
}
