package Solution.DFS;

import Solution.Common;

import java.util.Scanner;

/*
    철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
    철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
    N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.

    예시 입력
    259 5
    81
    58
    42
    33
    61
 */
public class Q7_HeaviestWeight implements Common {
    static int maxWeight, size;
    static int dogs[];
    static int possible = 0;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        maxWeight = sc.nextInt();
        size = sc.nextInt();
        dogs = new int[size];
        for (int i = 0; i < size; i++) {
            dogs[i] = sc.nextInt();
        }

        DFS(0, 0, 0);
        System.out.println(possible);
    }

    private static void DFS(int node, int cnt, int currentWeight) {
        if(node == size) {
            if(currentWeight < maxWeight){
                possible = Math.max(currentWeight, possible);
            }
        }else{
            DFS(node+1, cnt+1, currentWeight + dogs[node]);
            DFS(node+1, cnt, currentWeight);
        }
    }
}
