// 피보나치 수 - 재귀함수 사용
package homework.week05;
import java.util.*;

public class bj_10870 {

    static int fibo(int n) {
        if (n==0) {
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));

    }
}
