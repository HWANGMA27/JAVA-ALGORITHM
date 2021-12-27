package Solution.Sort;

import Solution.Common;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_BinarySearch implements Common {
    /*
    임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
    이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] input = new int[size];
        int result = 0;

        for (int i = 0; i < size; i++){
            input[i] = sc.nextInt();
        }

        //정렬
        Arrays.sort(input);

        int lt = 0;
        int rt = size-1;
        int mid = (lt + rt)/2;

        while(lt <= rt){
            mid = (lt + rt)/2;
            if(input[mid] == target){
                result = mid+1;
                System.out.println(result);
                return;
            }else if(input[mid] > target){
                rt = mid - 1;
            }else {
                lt = mid + 1;
            }
        }
    }
}
