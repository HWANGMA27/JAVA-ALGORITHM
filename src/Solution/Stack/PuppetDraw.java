package Solution.Stack;

import Solution.Common;

import java.util.*;

public class PuppetDraw implements Common {
    /*
    크레인 인형뽑기(카카오)
    입력에 인형 배열이 주어지고, 다음 입력에는 뽑기를 할 열이 주어진다.
    같은 인형이 바스켓에 싸이면 터지는데 뽑기를 모두 수행 한 후 총 터트려서 사라진 인형 갯수를 출력한다.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Queue<Integer>> puppet = new ArrayList<>();
        //입력 배열에 저장
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            puppet.add(new LinkedList<>());
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                int input = sc.nextInt();
                if (input != 0) puppet.get(j).add(input);
            }
        }

        int moveCnt = sc.nextInt();
        int[] move = new int[moveCnt];
        for (int i = 0; i < moveCnt; i++){
            move[i] = sc.nextInt();
        }

        Stack<Integer> basket = new Stack<>();
        int burstedPuppet = 0;

        for (int i = 0; i < moveCnt; i++){
            int target = move[i]-1;
            Queue<Integer> targetLine = puppet.get(target);
            if(!targetLine.isEmpty()){
                int beforePush;
                if(basket.isEmpty()){
                    beforePush = 101;
                }else{
                    beforePush = basket.peek();
                }
                int nowPush = targetLine.poll();
                if(beforePush == nowPush){
                    basket.pop();
                    burstedPuppet+=2;
                }else{
                    basket.push(nowPush);
                }

            }
        }
        System.out.println(burstedPuppet);
    }
}
