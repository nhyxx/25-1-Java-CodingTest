package hw3.bf;

import java.util.Scanner;

public class num10419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int d = Integer.parseInt(sc.nextLine());
            int t = 0;
            while (d >= t*t + t) {
                t++;
            }
            sb.append(t-1).append('\n'); // while 반복문 빠져나올 때 t 한번 더 더해짐. 따라서 t-1
        }
        System.out.println(sb);
        sc.close();
    }
}
