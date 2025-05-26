import java.util.*;

public class bj_2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[100][100];
		
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					arr[x + j][y + k] ++;
					
					if (arr[x + j][y + k] == 1) {
						cnt ++;
					}
				}
			}
		}
		System.out.print(cnt);
		sc.close();
	}
}
