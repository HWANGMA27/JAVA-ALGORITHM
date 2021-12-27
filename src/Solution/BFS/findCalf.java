package Solution.BFS;

import Solution.Common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class findCalf implements Common {
    /**
     * 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
     * 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
     * 송아지는 움직이지 않고 제자리에 있다.
     * 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
     * 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
     */
    int[] move = {1, -1, 5};
    int[] check = new int[10001];

    public void solution() {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int calf = sc.nextInt();

        int result = BFS(start, calf);
        System.out.println(result);
    }

    public int BFS(int start, int calf){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        boolean found = false;
        int level = 0;
        while(!queue.isEmpty()){
            int length = queue.size();
            for(int i=0; i< length; i++){
                int x = queue.poll();
                if(x == calf) return level;
                for (int j = 0; j < move.length; j++) {
                    int nextX = x + move[j];
                    if(nextX >= 1 && nextX <= 100000 && check[nextX] == 0){
                        check[nextX] = 1;
                        queue.offer(nextX);
                    }
                }
            }
            level++;
        }
        return level;
    }
}
