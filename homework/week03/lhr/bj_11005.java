import java.util.*;

public class bj_11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		String result = " ";
		
		while (n > 0) {
			if (n % b >= 10) {
				// 아스키코드 사용 -> 나머지를 문자로 변환
				result += (char) ((n % b) + 55);
				
			} else {
				result += (n % b);
			}
			n /= b;
		} 
		
		for (int i = result.length()-1; i>=0; i--) {
			System.out.print(result.charAt(i));
		}
	} 
	
}
