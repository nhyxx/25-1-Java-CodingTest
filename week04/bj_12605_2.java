import java.io.*;
import java.util.*;

public class bj_12605_2 {
    public static void main(String[] args) throws IOException { // bufferedleader 사용 코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            Stack<String> stack = new Stack<>();

            while (st.hasMoreTokens()) {
                stack.push(st.nextToken());
            }

            System.out.print("Case #" + i + ":");
            while (!stack.isEmpty()) {
                System.out.print(" " + stack.pop());
            }
            System.out.println();
        }
    }
}