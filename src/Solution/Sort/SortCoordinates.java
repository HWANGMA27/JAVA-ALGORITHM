package Solution.Sort;

import Solution.Common;

import java.util.*;

public class SortCoordinates implements Common {
    /*
    N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
    정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
     */
    @Override
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        ArrayList<Coordinate> arr = new ArrayList<>();

        for(int i = 0; i < cnt; i++){
            String[] temp = sc.nextLine().split(" ");
            arr.add(new Coordinate(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
        }
        Collections.sort(arr);

        for(Coordinate temp : arr){
            System.out.println(temp.x + " " + temp.y);
        }
    }

    class Coordinate implements Comparable<Coordinate>{
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate o) {
            //오름차순은 음수 리턴 내림차순은 양수 리턴
            if(this.x == o.x){
                return this.y-o.y;
            }else{
                return this.x - o.x;
            }
        }
    }
}


