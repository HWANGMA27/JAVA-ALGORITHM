package Solution.Sort;

import Solution.Common;

import java.util.Scanner;

public class Q4_LRUSelectionSort implements Common{
    /*
    N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
    정렬하는 방법은 선택정렬입니다.
    선택 정렬(選擇整列, selection sort)은 제자리 정렬 알고리즘의 하나로, 다음과 같은 순서로 이루어진다.
    1. 주어진 리스트 중에 최소값을 찾는다.
    2. 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
    3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.

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
        int cnt = sc.nextInt();
        int work = sc.nextInt();
        int[] input = new int[cnt];

        for (int i = 0; i < work; i++) {
            boolean isExist = false;
            int nextWork = sc.nextInt();
            int pos = 0;
            for(int j = 0; j < cnt; j++){
                if(nextWork == input[j]){
                    isExist = true;
                    pos = j;
                    break;
                }
            }
            if(isExist){
                for(int j = pos; j >= 0; j--){
                    input[j+1] = input[j];
                }
            }else{
                for(int j = cnt-2; j >= 0; j--){
                    input[j+1] = input[j];
                }
            }
            input[0] = nextWork;
        }

        for(int temp : input){
            System.out.print(temp + " ");
        }
    }
}
