package hw2.bruteforce;

import java.util.Scanner;

public class num1145 {
    // 대부분 최소공배수 구하는 메서드
    private static boolean findLCM(int n, int[] arr) {
        int cnt = 0; // 나눠지는 수의 개수 세기
        for (int i : arr) {
            if (n % i == 0) // 파라미터 n이 배열에 있는 특정 원소로 나눠질 때
                cnt++;
            if (cnt >= 3) { // 세 개 이상 나눠질 때
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        int ans = 4;
        while (true) {
            if (findLCM(ans, arr)) {
                System.out.println(ans);
                break;
            }
            ans++;
        }

        sc.close();
    }
}
