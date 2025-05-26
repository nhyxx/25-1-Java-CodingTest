import java.util.*;

public class bj_2581 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = 0;
		int min = Integer.MAX_VALUE; // 최솟값 저장을 위한 값 초기화
		
		for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        // 결과 출력
        if (sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
	
	
    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num < 2) return false; // 2보다 작은 수는 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    }
    
}