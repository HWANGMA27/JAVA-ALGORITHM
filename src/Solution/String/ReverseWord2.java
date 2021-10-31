package Solution.String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord2 {
    /*
    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
     특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
     */
    public void solution(){
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
