import java.util.*;

public class bj_2748 {
	
	static long[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new long[91]; // n은 90보다 작거나 같은 자연수
		
		System.out.println(fibonacci(n));
	}
	
	static long fibonacci(int n) {
		if (n <= 1) return n;
		
		if (dp[n] != 0) return dp[n];
		
		dp[n] = fibonacci(n-2) + fibonacci(n-1);
		return dp[n];
		
	}
}