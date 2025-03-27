package hw2;

import java.util.Scanner;

public class num5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            if (a == 0 && b == 0)
                break;

            if (b % a == 0) {
                sb.append("factor").append('\n');
            }
            else if (a % b == 0) {
                sb.append("multiple").append('\n');
            }
            else {
                sb.append("neither").append('\n');
            }
        }
        System.out.print(sb);

        sc.close();
    }
}
