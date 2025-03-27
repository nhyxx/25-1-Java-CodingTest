package hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> div = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                div.add(i);
            }
        }

        if (div.size() >= K) {
            System.out.println(div.get(K-1));
        }
        else {
            System.out.println(0);
        }

        sc.close();
    }
}
