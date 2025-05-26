import java.util.*;

public class bj_10870_dp_for {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        long[] dp = new long[21];  // n은 0 ≤ n ≤ 20
	        dp[0] = 0;
	        if (n >= 1) dp[1] = 1;

	        for (int i = 2; i <= n; i++) {
	            dp[i] = dp[i - 1] + dp[i - 2];
	        }

	        System.out.println(dp[n]);

	}

}
