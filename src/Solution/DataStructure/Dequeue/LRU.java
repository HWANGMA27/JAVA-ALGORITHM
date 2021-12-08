package Solution.DataStructure.Dequeue;

import Solution.Common;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class LRU implements Common {
    /*
    캐시메모리는 CPU와 주기억장치(DRAM) 사이의 고속의 임시 메모리로서 CPU가 처리할 작업을 저장해 놓았다가
    필요할 바로 사용해서 처리속도를 높이는 장치이다. 워낙 비싸고 용량이 작아 효율적으로 사용해야 한다.
    철수의 컴퓨터는 캐시메모리 사용 규칙이 LRU 알고리즘을 따른다.
    LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면 가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.
    캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.
    캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
    */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> input = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        int size = sc.nextInt();
        int work = sc.nextInt();

        for(int i=0; i<work; i++){
            int temp = sc.nextInt();
            if(input.contains(temp)){
                while(input.getFirst()!= temp){
                    st.push(input.pollFirst());
                }
                input.pollFirst();
                while(!st.isEmpty()){
                    input.addFirst(st.pop());
                }
                input.push(temp);
            }else{
                if(input.size() >= size){
                    input.pollLast();
                    input.addFirst(temp);
                }else{
                    input.addFirst(temp);
                }
            }
        }
        for(int value : input){
            System.out.print(value + " ");
        }
    }
}
