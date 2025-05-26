import java.util.Arrays;
import java.util.Scanner;

public class bj_2309_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[9]; // 난쟁이들의 키
        int sum = 0;
        
        // 입력 및 총합 계산
        for (int i = 0; i < 9; i++) {
            n[i] = sc.nextInt();
            sum += n[i];
        }
        
        // 두 명의 난쟁이 찾기
        boolean found = false;
        for (int j = 0; j < 9; j++) {
            for (int k = j + 1; k < 9; k++) {
                if (sum - n[j] - n[k] == 100) { // 합이 100인지 확인
                    n[j] = 0; // 제외
                    n[k] = 0; // 제외
                    found = true;
                    break;
                }
            }
            if (found) break; // 두 명을 찾았으면 중단
        }
        
        // 배열 정렬
        Arrays.sort(n);
        
        // 결과 출력 (0이 아닌 값만 출력)
        for (int i = 2; i < 9; i++) { // 정렬 후 맨 앞 0을 제외
            System.out.println(n[i]);
        }
    }
}
