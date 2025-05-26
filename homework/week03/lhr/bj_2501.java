import java.util.*;

public class bj_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int cnt = 0;
		int result = 0;
		
		for (int i=1; i<=N; i++) {
			if (N % i == 0) cnt ++;
			
			if (cnt == K) {
					result = i;
					System.out.print(result);
					break;
				} 
			}
			
		if (cnt < K) System.out.print(0);
		
		sc.close();
	}

}
