package hw3.bf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int a = 1; a < n-1; a++) { // 0 < a < b < n
                for (int b = a+1; b < n; b++) { // 0 < a < b < n
                    if ((a*a + b*b + m) % (a*b) == 0) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
