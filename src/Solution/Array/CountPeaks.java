package Solution.Array;

import Solution.Common;

import java.util.Scanner;

public class CountPeaks implements Common {
    /*
        지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
        각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
        격자의 가장자리는 0으로 초기화 되었다고 가정한다.
        만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
     */
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[size+2][size+2];
        boolean[][] isPeak = new boolean[size][size];
        int result = 0;

        for(int i = 1; i< size+1; i++){
            String[] temp = sc.nextLine().split(" ");
            for (int j = 1; j< size+1; j++){
                arr[i][j] = Integer.parseInt(temp[j-1]);
                isPeak[i-1][j-1] = true;
            }
        }

        for(int i = 1; i< size+1; i++){
            for (int j = 1; j< size+1; j++){
                //왼쪽 탐색
                if(arr[i-1][j] >= arr[i][j]) {
                    isPeak[i-1][j-1] = false;
                }
                //오른쪽 탐색
                if(arr[i+1][j] >= arr[i][j]){
                    isPeak[i-1][j-1] = false;
                }

                //위쪽 탐색
                if(arr[i][j-1] >= arr[i][j]){
                    isPeak[i-1][j-1] = false;
                }

                //아래쪽 탐색
                if(arr[i][j+1] >= arr[i][j]){
                    isPeak[i-1][j-1] = false;
                }
                if(isPeak[i-1][j-1]){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
