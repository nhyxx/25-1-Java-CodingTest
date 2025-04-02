package hw3.stackNqueue;

import java.util.Scanner;
import java.util.Stack;

public class num17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        // 오른쪽에서 볼 땐 스택, 왼쪽으로 볼 땐 큐
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(sc.nextLine());
            stack.push(h);
        }

        int cnt = 1; // 마지막 막대기 카운트
        int criterion = stack.pop(); // 마지막 막대기
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num > criterion) {
                // pop된게 클 때 기준을 바꾸고 카운트++
                criterion = num;
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
