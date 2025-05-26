import java.util.*;

public class bj_17608 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int h = sc.nextInt();
			stk.push(h);
		}

		int max = 0;
		int cnt = 0;
		
		while (!stk.isEmpty()) {
			int p = stk.pop();
			
			if (p > max) {
				max = p;
				cnt ++;
			}
			
		}
		
		System.out.println(cnt);
		sc.close();
		
	}
}
