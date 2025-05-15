// 막대기
package homework.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();

        int max = 0;
        for (int i = 0; i<N; i++){
            stack.push(Integer.parseInt(br.readLine()));
            if (max<stack.peek()) max = stack.peek();
        } // for문 끝

        int top = 0; // 보이는 블럭 높이
        int result = 0; // 결과값

        for (int i = 0; i<N; i++){
            int p = stack.pop();
            if (top<p){
                top = p;
                result++;
            }
            if (p==max) break;
        }

        System.out.println(result);
    }
}
