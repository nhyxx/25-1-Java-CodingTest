import java.util.*;

public class bj_27433 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long result = factorial(n);
		sc.close();
		
		System.out.println(result);
	
	}
	
	static long factorial(int i) {
		if (i <= 1) return 1;
		return i * factorial(i-1);
	}
	

}
