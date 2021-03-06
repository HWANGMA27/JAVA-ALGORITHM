package Solution.Hash;

import Solution.Common;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckDuplicate implements Common {
    /*
    현수네 반에는 N명의 학생들이 있습니다.
    선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
    만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
    N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < student; i++){
            int temp = sc.nextInt();
            if(map.containsKey(temp)) {
                System.out.println("D");
                return;
            }else{
                map.put(temp, 1);
            }
        }
        System.out.println("U");
    }
}
