import java.util.*;

public class bj_24416 {
	static int cnt1 = 0;
	static int cnt2 = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 5 <= n <= 40
		
		fib(n);
		fibonacci(n);
		
		System.out.print(cnt1 + " " + cnt2);
		
	}
	
	static int fib(int n) { // 코드 1
	    if (n == 1 || n == 2) {
			cnt1 ++; // f(1) 또는 f(2) 호출 횟수 
	    	return 1; 
	    }
	    else return (fib(n - 1) + fib(n - 2));
	}
	
	static int fibonacci(int n) { // 코드 2		
		int[] f = new int[n + 1];

	    f[1] = 1;
	    f[2] = 1;

	    for (int i = 3; i <= n; i++) {
	        f[i] = f[i - 1] + f[i - 2];  
	        cnt2 ++; // 점화식 호출 횟수
	    }

	    return f[n];	    		
	    
	}
}
