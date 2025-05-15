// 국회의원 선거 - priority queue 사용
package homework.week03;

import java.io.*;
import java.util.*;

public class bj_1417 {
    public static void main(String[] args) throws IOException{
        // 입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 후보의 수
        int M = Integer.parseInt(br.readLine()); // 기호 1번(다솜이) 지지자 수
        int answer = 0; // 정답 초기화

        if (N!=1){
            // 다른 후보 투표수 우선순위 큐(맥스힙으로 구현). Java의 PriorityQueue 기본값: 최소힙 -> reverseOrder 옵션
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            // 다른 후보 투표수 저장
            for (int i=1; i<N; i++){
                pq.add(Integer.parseInt(br.readLine()));
            }

            // 다른 후보 지지자 매수
            while (pq.peek()>=M){ // 맥스힙의 첫요소는 항상 최댓값
                int cur = pq.poll(); // 최우선순위 요소 꺼내고 동시에 제거(peek는 조회만)
                cur--;
                M++; // 매수해서 1번 지지자 1 증가
                answer++; // 매수 횟수 1 증가
                pq.add(cur); // 수정된 지지자 수 다시 큐에 넣기
            }

        } //if문 끝
        bw.write(answer+""); // 매수 횟수 BufferedWriter 저장
        bw.flush(); // 결과 출력

        bw.close(); br.close();
    }
}
