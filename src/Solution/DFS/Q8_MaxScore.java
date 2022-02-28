package Solution.DFS;

import Solution.Common;

import java.util.ArrayList;
import java.util.Scanner;

/*
  이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
  각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
  제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.

  에시 입력 (첫줄 문제수 & 제한시간 / 둘째줄 이후 소요시간 & 점수)
  5 20
  10 5
  25 12
  15 8
  6 3
  7 4
 */
public class Q8_MaxScore implements Common {
    static ArrayList<ArrayList<Integer>> problems = new ArrayList<>();
    static int cnt, timeLimit, maxScore;

    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        cnt = sc.nextInt();
        timeLimit = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            problems.add(temp);
        }

        DFS(0, 0, 0);
        System.out.println(maxScore);
    }

    private static void DFS(int node, int currentTime, int currentScore) {
        if (currentTime > timeLimit) {
            return;
        } else {
            maxScore = Math.max(maxScore, currentScore);
            if (node == cnt) {
                return;
            } else {
                //node번째 문제를 풀지 않은 경우
                DFS(node + 1, currentTime, currentScore);
                ArrayList<Integer> problem = problems.get(node);
                int score = problem.get(0);
                int time = problem.get(1);
                //node번째 문제를 푼 경우
                DFS(node + 1, currentTime + time, currentScore + score);
            }
        }
    }
}
