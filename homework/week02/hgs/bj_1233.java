package week02.homework;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class bj_1233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int x = s1 * s2 * s3;

        int[] arr = new int[x];
        Map<Integer, Integer> countMap = new HashMap<>();

        int a = 0; // 인덱스 따로 관리
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    arr[a++] = i + j + k;
                }
            }
        }

        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        int mostNum = arr[0];
        int maxCnt = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCnt || (entry.getValue() == maxCnt && entry.getKey() < mostNum)) {
                mostNum = entry.getKey(); // 주사위 합
                maxCnt = entry.getValue(); // 합 횟수
            }
        }

        System.out.println(mostNum);
    }
}
