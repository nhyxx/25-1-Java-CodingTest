package homework.week02;

import java.util.StringTokenizer;
import java.io.*;

public class bj_bruteforce_32941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int t_num = Integer.parseInt(st1.nextToken()); // 교시 개수
        int reserve = Integer.parseInt((st1.nextToken())); // 예약한 교시

        StringTokenizer st2= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st2.nextToken()); // 조원 수

        int student = 0; // 예약한 교시에 참석 가능한 인원 수

        // 반복문 돌면서 각 조원들 교시 정보 받기
        for (int i = 0; i<N; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            StringTokenizer st4 = new StringTokenizer(br.readLine()); // 각 조원이 가능한 교시 입력받기 위함.
            int cnt = Integer.parseInt(st3.nextToken()); // 각 조원이 참석가능한 교시의 개수
            boolean canAttend = false; // 참석가능여부 기본값 false로 지정

            // 각 조원이 참석가능한 교시를 돌면서 예약한 교시가 있는지 확인
            for (int j = 0; j<cnt; j++){
                int c = Integer.parseInt(st4.nextToken()); // 가능한 교시 입력받기
                if (c == reserve){
                    canAttend = true;
                }
            }
            if (canAttend) { // canAttend가 true라면(참석 가능하다면)
                student++;
            }
        } // for 문 끝

        if (student == N){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
