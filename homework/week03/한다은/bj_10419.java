// 지각
package homework.week03;

import java.io.*;
import java.util.*;

public class bj_10419 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 창영이가 궁금한 경우의 수

        // 지각한 시간의 제곱만큼 수업 시간 감소, 수업 시간>0이어야 함
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<T; i++){
            int d = Integer.parseInt(br.readLine()); // 수업시간 d
            int j = 0;
            while (j + j * j <= d){
                j++;
            }
            sb.append(j-1).append('\n');
        }// for문 끝

        System.out.println(sb);
    }
}
