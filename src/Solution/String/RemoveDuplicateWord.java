package Solution.String;

import java.util.*;

public class RemoveDuplicateWord {
    public void removeDuplicateWord(){
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
