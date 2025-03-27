package hw2.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        int[] freq = new int[81]; // S1+S2+S3의 최댓값은 80, 합의 배열 만들기

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    // 합을 구해서 해당 인덱스에 ++
                    int sum = i + j + k;
                    freq[sum]++;
                }
            }
        }

        int maxFreq = 0; // 가장 많이 발생하는 합
        int ans = Integer.MAX_VALUE; // 최솟값을 찾아야하기 때문에 max값 넣기
        for (int sum = 3; sum <= S1+S2+S3; sum++) {
            if (freq[sum] > maxFreq) {
                maxFreq = freq[sum];
                ans = sum;
            }
            else if (freq[sum] == maxFreq) {
                ans = Math.min(ans, sum);
            }
        }

        System.out.println(ans);
        br.close();
    }
}
