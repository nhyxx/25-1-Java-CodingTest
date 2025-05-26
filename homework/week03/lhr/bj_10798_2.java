import java.util.*;

public class bj_10798_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] ch = new char[5][15];
		
		for (int i=0; i<ch.length; i++) { // 배열에 문자열 5개 저장
			String str = sc.next();
			
			for (int j=0; j<str.length(); j++) { // 문자열의 1자씩 순회하여 저장
				ch[i][j] = str.charAt(j);
			}
		}
		
		// 세로 방향 출력
		for (int k=0; k<15; k++) {
			for (int l=0; l<5; l++) {
				if (ch[l][k] != '\0') System.out.print(ch[l][k]);
				}
			}
		sc.close();
		}
		
	}
