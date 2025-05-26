import java.util.*;

public class bj_10870_dp {
	
	static long[] dp; // 메모이제이션 배열
	//	dp 배열을 사용해서 이미 계산한 값은 저장하고 재사용

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new long[21]; // n이 20보다 작거나 같은 자연수 또는 0이므로
		
		System.out.println(fibo(n));
 
	}
	
	static long fibo(int n) {
		if (n <= 1) return n;
		if (dp[n] != 0) return dp[n]; // 이전에 계산한 값이면 바로 리턴
		
		dp[n] = fibo(n-1) + fibo(n-2);
		return dp[n]; // 계산 결과 저장 후 리턴
	}
	
}
