package hw3.stackNqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class num1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int ds = Integer.parseInt(sc.nextLine());

        // 다솜 당선 -> 다른 모든 사람의 득표수 보다 많은 득표수 -> 우선순위 큐 역순
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i < N; i++) {
            pq.offer(Integer.parseInt(sc.nextLine()));
        }

        int cnt = 0;

        while (!pq.isEmpty() && pq.peek() >= ds) {
            int max = pq.poll();
            max -= 1;
            ds += 1;
            cnt++;

            pq.offer(max);
        }

        System.out.println(cnt);
        sc.close();
    }
}
