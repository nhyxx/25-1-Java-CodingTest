import java.util.*;

public class bj_14568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		
		for (int a=1; a<n; a++) { // 택희
			for (int b=1; b<n; b++) { // 영훈
				for (int c=1; c<n; c++) { // 남규
					if (a+b+c == n && c >= 2 + b && a % 2 == 0) cnt ++;
				}
			}
		} 
		if (cnt == 0) System.out.print(0);
		else System.out.print(cnt);
		sc.close();
		
	}

}
