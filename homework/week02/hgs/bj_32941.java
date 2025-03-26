package week02.homework;

import java.util.Scanner;

public class bj_32941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 교시의 총 수 (사용 안 함)
        int x = sc.nextInt(); // 건우가 예약한 교시

        int n = sc.nextInt(); // 조원 수

        boolean all = true; // 모든 조원이 X에 참석 가능한지 여부

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt(); // 해당 조원이 참석 가능한 교시 수
            boolean afford = false;

            for (int j = 0; j < k; j++) {
                int time = sc.nextInt();
                if (time == x) {
                    afford = true;
                }
            }

            if (!afford) {
                all = false;
            }
        }

        System.out.println(all ? "YES" : "NO");
    }
}
