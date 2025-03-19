import java.util.*;
import java.util.stream.IntStream;

public class bj_1978 {
	
	// 소수 판별 함수
	static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true; // 소수
	}

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			int num = sc.nextInt();
			
			if (isPrime(num)) {
				cnt ++;
			}
		}
		
		System.out.print(cnt);
	    sc.close();
	}

}