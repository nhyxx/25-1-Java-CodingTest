// 피보나치 수 5(DP로 피보나치 풀기)
package homework.week06;

import java.util.*;
public class bj_10870 {

// 재귀함수를 이용한 방법
//    static int fibo(n){
//        if (n<=1) return n;
//        else return fibo(n-1)+fibo(n-2);
//    }

    // DP - 메모이제이션
    static long[] memo; // 계산 결과를 저장할 배열
    static long fibo(int n){
        if (n<=1) return n;
        else if (memo[n] != 0) return memo[n];
        else return memo[n] = fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        memo = new long[21];

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibo(N));


    }
}
