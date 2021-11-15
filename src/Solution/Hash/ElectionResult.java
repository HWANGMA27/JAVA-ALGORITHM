package Solution.Hash;

import Solution.Common;

import java.util.*;

public class ElectionResult implements Common {
    /*
    학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
    투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
    선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
    반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
     */
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        Map<String, Integer> result = new LinkedHashMap<>();

        String[] vote = sc.nextLine().split("");
        for(int i = 0; i < num; i++){
            result.put(vote[i], result.getOrDefault(vote[i], 0) + 1);
        }

        int max = 0;
        Iterator<String> it = result.keySet().iterator();

        while(it.hasNext()){
            String key = it.next();
            max = max < result.get(key) ? result.get(key) : max;
        }

        for(String temp : result.keySet()){
            if(max == result.get(temp)) {
                System.out.println(temp);
                break;
            }
        }
    }
}
