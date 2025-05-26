package hw0515;

import java.util.Scanner;

public class num9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] dp = new int[11];
        dp[1] = 1; // 1을 1,2,3의 합으로 나타내는 경우의 수. 1
        dp[2] = 2; // 2를 1,2,3의 합으로 나타내는 경우의 수. 1+1, 2
        dp[3] = 4; // 3을 1,2,3의 합으로 나타내는 경우의 수. 1+1+1, 1+2, 2+1, 3

        // dp 배열 채우기
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        StringBuilder sb = new StringBuilder();
        for(int t = 0; t<T; t++) {
            int n = sc.nextInt();
            sb.append(dp[n]).append('\n');
        }
        System.out.println(sb);
        sc.close();
    }
}
