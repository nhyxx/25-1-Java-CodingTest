import java.util.*;

public class bj_2522_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		top(1, n); 
		bottom(n-1, n);
		
		sc.close();
	}
	
	public static void top(int i, int n) {
        if (i > n) return;
        
        System.out.println(" ".repeat(n - i) + "*".repeat(i));
        top(i + 1, n);
    }
	
	public static void bottom (int i, int n) {
		if (i == 0) return;
		
		System.out.println(" ".repeat(n - i) + "*".repeat(i));
		bottom(i-1, n);
	}

}
