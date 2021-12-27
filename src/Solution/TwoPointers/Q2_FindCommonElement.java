package Solution.TwoPointers;

import Solution.Common;

import java.util.*;

public class Q2_FindCommonElement implements Common {
    /*
        A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int[] a = new int[first];
        for(int i = 0; i< first; i++){
            a[i] = sc.nextInt();
        }
        int second = sc.nextInt();
        int[] b = new int[second];
        for(int i = 0; i< second; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        Set<Integer> commonEle = new LinkedHashSet<>();
        int p1 = 0, p2 = 0;
        while(p1 < first && p2 < second){
            if(a[p1] > b[p2]){
                p2++;
            }else if(a[p1] < b[p2]) {
                p1++;
            }else if(a[p1] == b[p2]){
                commonEle.add(a[p1]);
                p1++;
                p2++;
            }
        }
        Iterator it = commonEle.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
