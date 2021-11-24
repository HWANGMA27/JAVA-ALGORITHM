package Solution.Queue;

import Solution.Common;

import java.util.*;
import java.util.stream.Collectors;

public class Curriculum implements Common {

    /*
        현수는 1년 과정의 수업계획을 짜야 합니다.
        수업중에는 필수과목이 있습니다. 이 필수과목은 반드시 이수해야 하며, 그 순서도 정해져 있습니다.
        만약 총 과목이 A, B, C, D, E, F, G가 있고, 여기서 필수과목이 CBA로 주어지면 필수과목은 C, B, A과목이며 이 순서대로 꼭 수업계획을 짜야 합니다.
        여기서 순서란 B과목은 C과목을 이수한 후에 들어야 하고, A과목은 C와 B를 이수한 후에 들어야 한다는 것입니다.
        현수가 C, B, D, A, G, E로 수업계획을 짜면 제대로 된 설계이지만
        C, G, E, A, D, B 순서로 짰다면 잘 못 설계된 수업계획이 됩니다.
        수업계획은 그 순서대로 앞에 수업이 이수되면 다음 수업을 시작하다는 것으로 해석합니다.
        수업계획서상의 각 과목은 무조건 이수된다고 가정합니다.
        필수과목순서가 주어지면 현수가 짠 N개의 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력하는 프로그램을 작성하세요.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        String[] target = sc.nextLine().split("");
        Queue<String> subject = new LinkedList<>();
        List<String> targetSbj = Arrays.stream(target).collect(Collectors.toList());

        for(String sbj : sc.nextLine().split("")){
            subject.add(sbj);
        }
        while(!subject.isEmpty()){
            for(String temp : targetSbj){
                if(temp.equals(subject.peek())){
                    targetSbj.remove(temp);
                }else{
                    subject.poll();
                    break;
                }
            }
        }
        if(targetSbj.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}