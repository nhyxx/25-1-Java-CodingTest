import java.util.*;

public class bj_4948 {
	public static boolean[] prime;
    
    public static void IsPrime(int n) {
    	prime = new boolean[2 * n + 1];
    	prime[0] = true;
    	prime[1] = true;
    	
    	for (int i = 2; i <= Math.sqrt(2 * n); i++) {
    		if (prime[i] == true) continue;
    		
    		for (int j = i*i; j<prime.length; j+=i) {
    			prime[j] = true;
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while (true) {
    		int n = sc.nextInt();
    		int count = 0;
    		
    		if (n == 0) break;
    		IsPrime(n);
    		
    		for (int i = n + 1; i <= 2*n; i++) {
    			if (prime[i] == false) count++;
    		}
    		System.out.println(count);
    	}
        sc.close();
    }

}