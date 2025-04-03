// 수학적 호기심
package homework.week03;

import java.io.*;
import java.util.StringTokenizer;

public class bj_9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄 읽기
            int n = Integer.parseInt(st.nextToken()); // 토큰화
            int m = Integer.parseInt(st.nextToken());

            // 브루트포스
            int cnt = 0;
            for (int b = 2; b<n; b++){
                for (int a = 1; a<b; a++){
                    if (((a*a+b*b+m)%(a*b)) == 0) cnt+=1;
                }
            }
            sb.append(cnt).append("\n");
        }// 제일 바깥 for문 끝

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
