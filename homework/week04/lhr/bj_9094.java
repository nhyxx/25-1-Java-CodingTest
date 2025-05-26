import java.util.*;

public class bj_9094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int cnt = 0;
			
			for (int a=1; a<n; a++) {
				for (int b=a+1; b<n; b++) {
					int x = (a * a + b * b + m);
					int y = (a * b) ;
					
					if (x % y == 0) cnt ++;
				}
			}
			System.out.println(cnt);
		}
	}

}
