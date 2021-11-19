package Solution.Hash;

import Solution.Common;

import java.util.*;

public class Anagram2 implements Common {
    /*
        S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
        아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
     */
    /*
        HashMap과 SlidingWindow를 같이 활용해 O(n)의 시간복잡도를 갖는 풀이
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        String[] target = sc.nextLine().split("");
        int windowSize = target.length;

        Map<String, Integer> inputMap = new LinkedHashMap<>();
        Map<String, Integer> targetMap = new HashMap<>();

        for(String temp : target){
            targetMap.put(temp, targetMap.getOrDefault(temp, 0) +1);
        }
        for(int i = 0; i < windowSize-1; i++){
            inputMap.put(input[i], inputMap.getOrDefault(input[i], 0) +1);
        }
        int lt = 0, cnt = 0;

        for(int rt = windowSize-1; rt < input.length; rt++){
            inputMap.put(input[rt], inputMap.getOrDefault(input[rt], 0) +1);
            if(inputMap.equals(targetMap)){
                cnt++;
            }
            if(inputMap.get(input[lt]) == 1){
                inputMap.remove(input[lt++]);
            }else{
                inputMap.put(input[lt], inputMap.get(input[lt++]) -1);
            }
        }
        System.out.println(cnt);
    }
}
