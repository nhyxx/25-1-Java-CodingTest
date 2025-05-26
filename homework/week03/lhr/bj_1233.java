import java.util.*;

public class bj_1233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();
		
		// 합의 빈도를 저장할 배열 (최대 가능한 합은 S1 + S2 + S3)
        int[] frequency = new int[S1 + S2 + S3 + 1];

        // 모든 주사위 합 계산
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int sum = i + j + k;
                    frequency[sum]++;
                }
            }
        }

        // 가장 높은 빈도와 그 합 찾기
        int maxFrequency = 0;
        int result = 0;

        for (int sum = 3; sum <= S1 + S2 + S3; sum++) { // 합은 최소 3부터 시작
            if (frequency[sum] > maxFrequency) {
                maxFrequency = frequency[sum];
                result = sum;
            }
        }

        // 결과 출력
        System.out.println(result);
        sc.close();
    }
}