package Solution.BFS;

import Solution.Common;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요.
경로의 길이는 출발점에서 도착점까지 가는데 이동한 횟수를 의미한다.
출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 도로이다.

예시입력
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0

예시 출력
12

 */
public class Q5_Maze implements Common {
    static final int destination = 6;
    static int[][] maze = new int[destination+1][destination+1];
    static int[][] step = new int[destination+1][destination+1];
    static int[] xMove = {0, -1, 0, 1};
    static int[] yMove = {1, 0, -1, 0};

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= destination ; i++) {
            for (int j = 0; j <= destination; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        BFS(0, 0);
        if(step[destination][destination] == 0){
            System.out.println(-1);
        }else{
            System.out.println(step[destination][destination]);
        }
    }

    private static void BFS(int startX, int startY) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(startX, startY));
        step[startX][startY] = 0;

        while (!queue.isEmpty()) {
            Location now = queue.poll();
            int nowX = now.x, nowY = now.y;
            for (int i = 0; i < 4; i++) {
                int nextX = now.x + xMove[i];
                int nextY = now.y + yMove[i];
                if(nextX >= 0 && nextX <= destination && nextY >= 0 && nextY <= destination && maze[nextX][nextY] == 0){
                    step[nextX][nextY] = step[nowX][nowY] + 1;
                    maze[nextX][nextY] = 1;
                    queue.offer(new Location(nextX, nextY));
                }
            }
        }
    }

    private static class Location {
        int x;
        int y;

        public Location(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
