package Solution.BFS;

import Solution.Common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    정점 N개와 간선 M이 주어진다.
    1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.

    입력 예제
    6 9
    1 3
    1 4
    2 1
    2 5
    3 4
    4 5
    4 6
    6 2
    6 5
 */
public class Q4_ShortestPath2 implements Common {
    int size, inputSize;
    ArrayList<ArrayList<Integer>> possiblePath;
    int[] shortestPath;
    int check[];
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        inputSize = sc.nextInt();
        shortestPath = new int[size+1];
        possiblePath = new ArrayList<>();
        check = new int[size+1];
        for (int i = 0; i <= size; i++) {
            possiblePath.add(new ArrayList<>());
        }

        for (int i = 0; i < inputSize; i++) {
            int start = sc.nextInt();
            int move = sc.nextInt();
            possiblePath.get(start).add(move);
        }
        check[1] = 1;
        BFS(1);
        for (int i = 2; i <= size; i++) {
            System.out.println(i +" : " + shortestPath[i]);
        }
    }

    private void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            ArrayList<Integer> paths = possiblePath.get(currentNode);
            for (Integer path : paths) {
                if(check[path] == 0) {
                    check[path] = 1;
                    queue.offer(path);
                    shortestPath[path] = shortestPath[currentNode] + 1;
                }
            }
        }
    }
}
