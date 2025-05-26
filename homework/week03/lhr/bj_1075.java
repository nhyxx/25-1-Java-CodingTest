import java.util.*;

public class bj_1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f = sc.nextInt();
		
		int answer = (n/100) * 100; // 뒤 두자릿 수 00으로 바꾸기
		
		
		while (true) {
			if (answer % f == 0) { // f로 나뉘면 멈추기
				break;
			}
			answer ++; // f로 안 나뉘면 +1
		}
		
		System.out.printf("%02d", answer % 100); // f로 나뉘어지는 수 뒤의 두 자리만 출력
		sc.close();
	}

}
