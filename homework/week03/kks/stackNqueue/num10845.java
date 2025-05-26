package hw3.stackNqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            if (str.startsWith("push")) {
                int n = Integer.parseInt(str.split(" ")[1]);
                queue.offer(n);
            }
            else if (str.equals("pop")) {
                sb.append(queue.isEmpty() ? "-1" : queue.poll()).append('\n');
            }
            else if (str.equals("size")) {
                sb.append(queue.size()).append('\n');
            }
            else if (str.equals("empty")) {
                sb.append(queue.isEmpty() ? "1" : "0").append('\n');
            }
            else if (str.equals("front")) {
                sb.append(queue.isEmpty() ? "-1" : queue.peek()).append('\n');
            }
            // 큐는 FIFO, 마지막은 확인불가. 따라서 LinkedList로 형변환 후 getLast메서드 활용
            else if (str.equals("back")) {
                sb.append(queue.isEmpty() ? "-1" : ((LinkedList<Integer>) queue).getLast()).append('\n');
            }
        }

        System.out.println(sb);
        sc.close();
    }
}
