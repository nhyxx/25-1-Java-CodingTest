import java.util.*;

public class bj_11653_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 2; i <= Math.sqrt(n); i++) { // i 범위
            while (n % i == 0) { // 같은 소인수를 계속 나누기
                System.out.println(i);
                n /= i;
            }
        }
        
        // 남아 있는 n이 1보다 크면 마지막 소수 출력
        if (n > 1) {
            System.out.println(n);
        }
    }
}
