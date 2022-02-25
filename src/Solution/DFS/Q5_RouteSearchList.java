package Solution.DFS;

import Solution.Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    n개의 정점과 그 정점을 연결하는 간선의 데이터가 주어질 때
    1에서 n까지 갈 수 있는 경로의 수를 출력하라
    정점의 갯수가 많아지게되면 배열의 사이즈가 커지게 됨으로
    방문가능한 경로를 arrayList로 저장하도록 적용
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
public class Q5_RouteSearchList implements Common {
    int size, paramSize;
    List<List<Integer>> pathList = new ArrayList<>();
    int cnt = 0;
    int[] visit;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        paramSize = sc.nextInt();
        final int node = 1;
        visit = new int[size+1];

        for (int i = 0; i < size; i++) {
            pathList.add(new ArrayList<>());
        }
        for (int i = 0; i < paramSize; i++) {
            int start = sc.nextInt();
            int move = sc.nextInt();
            pathList.get(start).add(move);
        }
        visit[node] = 1;
        DFS(node);
        System.out.println(cnt);
    }

    private void DFS(int node) {
        if(node == size){
            cnt++;
        }else{
            List<Integer> nextPaths = pathList.get(node);
            for (int nextPath: nextPaths) {
                if(visit[nextPath] == 0) {
                    visit[nextPath] = 1;
                    DFS(nextPath);
                    visit[nextPath] = 0;
                }
            }
        }
    }
}
