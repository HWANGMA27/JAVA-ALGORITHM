package Solution.TwoPointers;

import Solution.Common;

import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArray implements Common {
    /*
        오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        //입력받은 숫자 배열에 저장
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

        int p1 = 0, p2 = 0;
        while(p1 < first && p2 < second){
            if(a[p1] < b[p2]) System.out.print(a[p1++] + " ");
            else System.out.print(b[p2++] + " ");
        }

        while(p1 < first){
            System.out.print(a[p1++] + " ");
        }

        while(p2 < second){
            System.out.print(b[p2++] + " ");
        }
    }

    public void solutionWithoutAlgorithm() {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        String fInput = sc.nextLine();
        int second = Integer.parseInt(sc.nextLine());
        String sInput = sc.nextLine();

        int fin = first + second;
        StringBuilder sb = new StringBuilder(fInput);
        sb.append(" ");
        sb.append(sInput);
        String[] result = sb.toString().split(" ");
        int[] finArr = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(finArr);
        for(int temp : finArr){
            System.out.print(temp + " ");
        }
    }
}
