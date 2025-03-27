package hw2;

import java.util.Scanner;

public class num11005 {
    private static String change(int n, int b) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int rem = n % b;
            if (rem < 10) {
                sb.append((char)(rem + '0'));
            }
            else {
                sb.append((char)(rem - 10 + 'A'));
            }
            n /= b;
        }

        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        String result = change(N, B);
        System.out.println(result);

        sc.close();
    }
}
