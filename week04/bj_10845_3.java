import java.util.*;

public class bj_10845_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int lastNum = 0; // ✅ for문 바깥에서 선언하여 마지막 삽입 값을 유지

        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine(); // 한 줄 입력 받기
            StringTokenizer st = new StringTokenizer(input);
            String cmd = st.nextToken(); // 명령어 읽기

            switch (cmd) {
                case "push":
                    int num = Integer.parseInt(st.nextToken()); // 숫자 읽기
                    q.add(num);
                    lastNum = num; // ✅ 마지막 삽입 값 저장
                    break;

                case "pop":
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                    	System.out.println(q.poll()); // ✅ 제거된 값 출력
                        if (q.isEmpty()) lastNum = -1; // ✅ 큐가 비었으면 lastNum 초기화
                    }
                    break;

                case "size":
                    System.out.println(q.size());
                    break;

                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;

                case "front":
                    System.out.println(q.isEmpty() ? -1 : q.peek());
                    break;

                case "back":
                    System.out.println(q.isEmpty() ? -1 : lastNum); // ✅ lastNum 사용
                    break;
            }
        }
        sc.close();
    }
}