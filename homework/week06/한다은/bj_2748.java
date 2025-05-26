package homework.week06;
import java.util.*;

public class bj_2748 {

    static long[] memo; // 전역으로 배열 선언

    static long fibo(int n){
        if (n<=1) return n;
        // 기억 배열에 n번째 피보나치 수가 저장되어 있으면 그거 불러오기
        else if (memo[n] != 0) return memo[n];
        // 기억 배열에 없으면 계산해서 배열에 집어넣기
        else return memo[n] = fibo(n-2)+ fibo(n-1);
    }

    public static void main(String[] args) {
        memo = new long[91]; // 문제에서 n은 90보다 작거나 같은 자연수라고 함.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibo(N));

    }
}
