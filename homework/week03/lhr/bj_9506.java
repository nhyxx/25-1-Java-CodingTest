import java.util.*;

public class bj_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		while (true) {
			int N = sc.nextInt();
			
			if (N == -1) break;
			
			int sum = 1;
			String result = N + " = 1";
			
			for (int i=2; i<N; i++) {
				if (N % i == 0) {
					sum += i ;
					result += " + " + i;
				}  
			}
			
			if (sum == N) {
				System.out.println(result);
			} else {
				System.out.println(N + " is NOT perfect.");
			}
			
		}
		sc.close();
	} 

}
