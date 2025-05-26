import java.util.*;

public class bj_2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[9][9];
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				array[i][j] = sc.nextInt();
 			}
		}
		
		int max = -1; // 최댓값이 1일 때를 고려하기 위해 -1로 설정
		int row = 0;
		int col = 0;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
					row = i + 1;
					col = j + 1;
				}
				
			}
		}
		
		System.out.println(max);
		System.out.print(row + " " + col);
		sc.close();
	}
	

}
