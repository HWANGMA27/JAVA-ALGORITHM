package Solution.Array;

import Solution.Common;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_StudentInSight implements Common {

    /*
    선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
    (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int[] height = Arrays.asList(input).stream().mapToInt(Integer::parseInt).toArray();
        int cnt = 1;
        int maxHight = height[0];
        for(int i=1; i < size; i++){
            if(maxHight < height[i]){
                cnt++;
                maxHight = height[i];
            }
        }
        System.out.println(cnt);
    }
}
