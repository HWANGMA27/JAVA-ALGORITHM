package Solution.String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord2 {
    public void reverseWord2(){
        Scanner in = new Scanner(System.in);
        char[] input = in.nextLine().toCharArray();
        int size = input.length;
        Character[] output = new Character[size];
        for(int i = 0; i<size; i++){
            int ascii = (int) input[i];
            if(ascii > 64 && ascii <91 ||ascii > 96 && ascii <123){
                output[size -1 -i] = input[i];
            }else{
                output[i] = input[i];
            }
        }
        Stream<Character> characterStream = Arrays.stream(output);
        String result = characterStream.map(String::valueOf).collect(Collectors.joining());
        System.out.println(result);
    }
}
