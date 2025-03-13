package codingtest;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] array = new int[m+1];
		
		// 입력받은 구간 배열 생성
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		array[0] = 0;
		array[1] = 0;
		
		// 소수 아닌 수의 배수들 삭제
		for (int i = 2; i * i < array.length; i++) {
			if (array[i] != 0) {
				for (int j = i * i; j <= array.length; j += i) {
					array[j] = 0;
				}
			}
		}
		
		for (int i = n; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.println(array[i]);
			}
		}
		
		sc.close();

	}
}
