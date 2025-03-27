package hw2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int newN = (N / 100) * 100;

        for (int i = 0; i < 100; i++) {
            if ((newN + i) % F == 0) {
                System.out.printf("%02d", i);
                break;
            }
        }
        br.close();
    }
}
