package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        long sum = 0;
        long power = 1; // 자리를 나타내는 변수

        // 제일 작은 자리의 수부터 차례로 더해나감
        for (int i = N.length()-1; i>=0; i--) {
            char c = N.charAt(i);
            int value;

            if ('A'<= c && c<='Z')
                value = c - 'A' + 10;
            else
                value = c - '0';

            sum += value * power;
            power *= B;
        }

        System.out.println(sum);

        br.close();
    }
}
