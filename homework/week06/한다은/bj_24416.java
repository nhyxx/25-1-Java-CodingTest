package homework.week06;
import java.io.*;
public class bj_24416 {

    static int cnt1, cnt2;
    static int[] memo; // DP에서 사용하는 기억 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new int[n];

        cnt1=0; cnt2=0;

        fib(n);
        fibonacci(n);

        System.out.println(cnt1+" "+ cnt2);
    }

    // 재귀
    static int fib(int n){
        if (n==1 || n==2){
            cnt1++;
            return 1;
        }
        else return fib(n-1)+fib(n-2);
    }

    // 동적 프로그래밍
    static int fibonacci(int n){
        memo[0]=1; memo[1]=1;
        for (int i=2; i<n; i++){
            memo[i] = memo[i-1] + memo[i-2];
            cnt2++;
        }
        return memo[n-1];

    }
}
