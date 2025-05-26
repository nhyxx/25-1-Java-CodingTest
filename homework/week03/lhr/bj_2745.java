import java.util.*;

public class bj_2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next(); // 수
		int b = sc.nextInt(); // 진법
		
		int tmp = 1; // 자릿수 가중치 계산 = 진법^2, ...
		int result = 0;
		
		for (int i = n.length() - 1; i>=0; i--) {
			char c = n.charAt(i);
			
			if (c >= 'A' && c <= 'Z' ) {
				result += (c - 55) * tmp;
			} else {
				result += (c - 48) * tmp;
			}
			tmp *= b;
		}
		System.out.print(result);
		sc.close();
				
	}
}
