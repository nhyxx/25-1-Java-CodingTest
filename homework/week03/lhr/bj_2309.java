import java.util.*;

public class bj_2309 {
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
        for (int j = 0; j < 9; j++) {
            for (int k = j + 1; k < 9; k++) {
                if (sum - n[j] - n[k] == 100) { // 합이 100인지 확인
                    n[j] = 0; // 제외
                    n[k] = 0; // 제외
                    
                    Arrays.sort(n); // 정렬
                    for (int l = 2; l < 9; l++) { // 정렬 후 0 제외하고 출력
                        System.out.println(n[l]);
                    }
                    return; // 프로그램 종료
                }
            }
        }
    }
}
