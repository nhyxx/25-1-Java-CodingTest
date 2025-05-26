import java.util.*;

public class bj_10419 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int result = 0;
		
		for (int i=0; i<t; i++) {
			int d = sc.nextInt();
			
			for (int j = 0; j * j + j <= d; j++) { // 어차피 d를 넘지 못함
                result = j; // 조건을 만족하는 최대 `j`를 저장
            } System.out.println(result);
				
			} 
		}

	}

