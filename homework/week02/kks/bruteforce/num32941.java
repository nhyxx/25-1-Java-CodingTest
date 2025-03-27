package hw2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class num32941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        // 모든 time hashset
        Set<Integer> allTime = new HashSet<>();
        for (int i = 0; i <= T; i++)
            allTime.add(i);

        // 각 조원 별 가능 time
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            Set<Integer> KTime = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                KTime.add(Integer.parseInt(st.nextToken()));
            }
            allTime.retainAll(KTime); // 모든 타임 set과 교집합 -> 가능 time set 만들기
        }

        if (allTime.contains(X)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        br.close();
    }
}
