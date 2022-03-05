package Solution.DFS;

import Solution.Common;

import java.util.Scanner;

/*
7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.
출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 통로이다.
격자판의 움직임은 상하좌우로만 움직인다.

입력
7*7 격자판의 정보
입력 예제
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0

출력
첫 번째 줄에 경로의 가지수를 출력한다.
출력 예제
8
 */
public class Q11_Maze implements Common {
    static int size = 7;
    static int[][] maze = new int[size][size];
    static int[][] isVisit = new int[size][size];
    static int cnt = 0;
    static int destinationX = size - 1, getDestinationY = size - 1;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        DFS(0, 0);
        System.out.println(cnt);
    }

    private static void DFS(int x, int y) {
        if (x == destinationX && y == getDestinationY) {
            cnt++;
        } else {
            isVisit[x][y] = 1;
            checkNextMove(x, y);
            isVisit[x][y] = 0;
        }
    }

    private static void checkNextMove(int x, int y) {
        //상
        if (y - 1 > 0 && isVisit[x][y - 1] != 1 && maze[x][y-1] == 0 ) {
            DFS(x, y - 1);
        }
        //하
        if (y + 1 < size && isVisit[x][y + 1] != 1 && maze[x][y+1] == 0) {
            DFS(x, y + 1);
        }
        //좌
        if (x - 1 > 0 && isVisit[x - 1][y] != 1 && maze[x-1][y] == 0) {
            DFS(x - 1, y);
        }
        //우
        if (x + 1 < size && isVisit[x + 1][y] != 1 && maze[x+1][y] == 0) {
            DFS(x + 1, y);
        }
    }
}
