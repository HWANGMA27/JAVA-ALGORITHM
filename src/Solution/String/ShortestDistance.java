package Solution.String;

import Solution.Common;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestDistance implements Common {
    /*
    한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
     */
    public void solution(){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        char[] sentence = input[0].toCharArray();
        int[] distance = new int[sentence.length];
        for(int i=0; i<distance.length; i++) {
            distance[i] = 100;
        }
        char target = input[1].charAt(0);

        for(int i=0; i<sentence.length; i++) {
            if(sentence[i] == target){
                distance[i] = 0;
            }else{
                for (int j = 0; j < sentence.length; j++) {
                    if(i != j && sentence[j] == target && distance[i] > Math.abs(j-i)){
                        distance[i] = Math.abs(j-i);
                    }
                }
            }
        }

        for(int temp : distance){
            System.out.print(temp + " ");
        }
    }

    /*
        2중 포문을 1번으로 끝내는 방법
     */
    public void solution2(){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String s = input[0];
        char t = input[1].charAt(0);
        int[] answer = new int[s.length()];
        int p = 1000;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;

        for(int i = s.length()-1; i >= 0; i++){
            if(s.charAt(i) == t){
                p=0;
            }else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }

        for(int temp : answer){
            System.out.print(temp + " ");
        }
    }
}
