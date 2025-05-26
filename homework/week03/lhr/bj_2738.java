import java.util.*;

public class bj_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		
		// 첫 번째 행렬
		for (int i=0; i<arrA.length; i++) {
			for (int j=0; j<arrA[i].length; j++) {
				arrA[i][j] += sc.nextInt();
			}
		}
		
		for (int i=0; i<arrB.length; i++) {
			for (int j=0; j<arrB[i].length; j++) {
				arrB[i][j] += sc.nextInt();
			}
		}
		
		int[][] sum = new int[n][m];
		
		 for (int k=0; k<n; k++) {
			 for (int l=0; l<m; l++) {
				 sum[k][l] = arrA[k][l] + arrB[k][l];
				 System.out.print(sum[k][l] + " ");
			 }
			 System.out.println("");
		 }
		
	}
}
