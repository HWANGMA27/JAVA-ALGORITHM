package Solution.DFS;

import Solution.Common;

import java.util.Scanner;

/*
    n개의 정점과 그 정점을 연결하는 간선의 데이터가 주어질 때
    1에서 n까지 갈 수 있는 경로의 수를 출력하라
    예제 input 데이터
    5 9
    1 2
    1 3
    1 4
    2 1
    2 3
    2 5
    3 4
    4 2
    4 5
 */
public class Q4_RouteSearch implements Common {
    static int[][] graph;
    static int[] check;
    static int n, m;
    static int cnt = 0;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][m + 1]; //탐색 가능한 경로 데이터
        check = new int[n + 1]; //노드를 방문했는가 체크

        for (int i = 0; i < m; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            graph[p1][p2] = 1;
        }
        check[1] = 1;
        DFS(1);
        System.out.println(cnt);
    }

    private void DFS(int node){
        if(node == n){
            cnt++;
        }else {
            for (int i = 1; i <= n; i++) {
                if(graph[node][i] == 1 && check[i] == 0){
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }
    }
}
