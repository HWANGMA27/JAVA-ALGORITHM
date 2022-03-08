package Solution.BFS;

import Solution.Common;

import java.util.*;

/*
창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만, 아직 익지 않은 토마토들도 있을 수 있다. 보관 후 하루가 지나면,
익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다.
하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향에 있는 토마토를 의미한다. 대각선 방향에 있는 토마토들에게는 영향을 주지 못하며,
토마토가 혼자 저절로 익는 경우는 없다고 가정한다. 현수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다.
토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때,
며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램을 작성하라. 단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.

입력예제
첫째줄 상자크기 M, N
둘째줄부터는 토마토 유무
정수 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토가 들어있지 않은 칸을 나타낸다.

6 4
0 0 -1 0 0 0
0 0 1 0 -1 0
0 0 -1 0 0 0
0 0 0 0 -1 1

출력예제
4

 */
public class Q6_Tomato implements Common {
    public static class Position {
        int x, y;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int[][] tomato, dist;
    static int[] moveX = {-1, 0, 1, 0};
    static int[] moveY = {0, -1, 0, 1};
    static List<Position> pos = new ArrayList<>();
    static int result = 0;
    static int m, n;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int oneCnt = 0;
        tomato = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tomato[i][j] = sc.nextInt();
                if (tomato[i][j] == 1) {
                    oneCnt++;
                    pos.add(new Position(i, j));
                }
            }
        }
        if(oneCnt == 0){
            System.out.println(-1);
        }else{
            BFS();
            boolean flag = true;
            int answer = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(tomato[i][j] == 0) flag = false;
                }
            }
            if(flag){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        answer = Math.max(answer, dist[i][j]);
                    }
                }
                System.out.println(answer);
            }else System.out.println(-1);
        }
    }

    private static void BFS() {
        Queue<Position> queue = new LinkedList<>();
        for (Position start : pos) {
            queue.offer(start);
        }
        while (!queue.isEmpty()){
            Position node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = node.x + moveX[i];
                int nextY = node.y + moveY[i];
                if(nextX < n && nextY < m
                        && nextX >=0 && nextY >=0
                        && tomato[nextX][nextY] == 0){
                    tomato[nextX][nextY] = 1;
                    queue.offer(new Position(nextX, nextY));
                    dist[nextX][nextY] = dist[node.x][node.y] +1;
                }
            }
        }
    }
}
