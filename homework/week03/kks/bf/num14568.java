package hw3.bf;

import java.util.Scanner;

public class num14568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        // th는 택희, yh는 영훈, nk는 남규
        for (int th = 2; th < N; th += 2) { // 택희는 짝수개 배당
            for (int yh = 1; 2*yh < N; yh++) { // 영훈 + 영훈 + 2
                int nk = N - th - yh; // 남는 사탕은 없어야 함
                if (nk <= 0) continue; // 사탕은 모두 1개 이상 받아야 함
                if (nk >= yh+2) cnt++; // 남규 >= 영훈 +2일 때
            }
        }
        System.out.print(cnt);
        sc.close();
    }
}
