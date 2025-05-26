import java.util.*;

public class bj_2522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
				System.out.print(" ".repeat(n-i) + "*".repeat(i));
				System.out.println();
			} System.out.print("");
	
		for (int i=n-1; i>0; i--) {
			System.out.print(" ".repeat(n-i) + "*".repeat(i));
			System.out.println();
		} 
	}
}

