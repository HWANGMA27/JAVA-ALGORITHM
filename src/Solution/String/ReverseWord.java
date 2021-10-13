package Solution.String;

import java.util.Scanner;

public class ReverseWord {
    public void reverseWord(){
        Scanner in = new Scanner(System.in);
        int cnt = Integer.parseInt(in.nextLine());
        String[] arr = new String[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = in.nextLine();
        }
        for(String temp : arr){
            StringBuilder sb = new StringBuilder(temp);
            System.out.println(sb.reverse().toString());
        }
    }
}
