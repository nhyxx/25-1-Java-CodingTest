import java.util.*;

public class bj_9095_dp {
	
	static int[] dp;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		dp = new int[11]; // 정수 n은 양수이며 11보다 작음
		
		dp[1] = 1; // 1
		dp[2] = 2; // 1+1, 2
		dp[3] = 4; // 1+1+1, 1+2, 2+1, 3
		
		// 미리 dp[4]부터 dp[10]까지 계산해둠
        for (int i = 4; i <= 10; i++) { // n이 최대 10
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);  // 정답 출력
        }
	}

}
