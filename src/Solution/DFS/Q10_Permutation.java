package Solution.DFS;

import Solution.Common;

import java.util.Scanner;

/*
    10 이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일열로 나열하는 방법을 모두
    출력합니다.

    - 입력 예제
    3 2
    3 6 9
    - 출력 예제
    3 6
    3 9
    6 3
    6 9
    9 3
    9 6
 */
public class Q10_Permutation implements Common {
    int[] input, pm, isVisit;
    int inputSize, outputSize;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        inputSize = sc.nextInt();
        outputSize = sc.nextInt();
        input = new int[inputSize];
        isVisit = new int[inputSize];
        pm = new int[outputSize];

        for (int i = 0; i < inputSize; i++) {
            input[i] = sc.nextInt();
        }

        DFS(0);
    }

    private void DFS(int node) {
        if (node == outputSize) {
            for (int i = 0; i < outputSize; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < inputSize; i++) {
                if (isVisit[i] != 1) {
                    isVisit[i] = 1;
                    pm[node] = input[i];
                    DFS(node + 1);
                    isVisit[i] = 0;
                }
            }
        }
    }
}
