package hw0515;

import java.util.Scanner;

public class num24416 {
    static int cnt_fib = 0;
    static int cnt_fibonacci = 0;

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt_fib += 1;
            return 1;
        }
        else {

            return (fib(n-1) + fib(n-2));
        }
    }

    private static int fibonacci(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1; dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            cnt_fibonacci += 1;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        fibonacci(n);

        System.out.printf("%d %d", cnt_fib, cnt_fibonacci);
        sc.close();
    }
}
