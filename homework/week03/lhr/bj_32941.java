import java.util.*;

public class bj_32941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 교실 예약 가능한 교시 개수
		int x = sc.nextInt(); // 예약한 교시
		int n = sc.nextInt(); // 조원 수
		
		int cnt = 0; // 참석 가능한 조원 수
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(); // 현재 조원이 예약할 수 있는 교시 개수
			
			for (int j = 0; j < a; j++) {
				int b = sc.nextInt(); // 참석 가능한 교시 
				
				if (b == x) {
					cnt ++;
				}
			}
		}
		
		if (cnt == n) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
		sc.close();
	}

}
