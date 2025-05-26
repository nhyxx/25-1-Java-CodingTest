// 단어순서 뒤집기
package homework.week03;

import java.io.*;
import java.util.*;

public class bj_12605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 입력 먼저 저장
        List<String[]> inputList = new ArrayList<>();


        for (int i = 0; i<n; i++) {
            String[] words = br.readLine().split(" ");
            inputList.add(words);
        }

        // 스택에 넣기
        for (int j = 0; j<n; j++){
            Stack<String> stack = new Stack<>();
            for (String word: inputList.get(j)) {
                stack.push(word);
            }

            // 스택에서 꺼내기
            System.out.print("Case #"+ (j+1) + ": ");
            while (!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }
            System.out.println(); // 줄바꿈

        }
    }
}
