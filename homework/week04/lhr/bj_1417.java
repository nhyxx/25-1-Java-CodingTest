import java.util.*;


public class bj_1417 {

	public static void main(String[] args) {
		// 우선순위 큐(최대 힙) -> 가장 큰 값이 먼저 나옴
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int A = sc.nextInt(); // 다솜
		
		for (int i=1; i<n; i++) { // 다른 후보들 득표수 힙에 저장 
			pq.add(sc.nextInt());
		}
		
		int cnt = 0;
		
		while (!pq.isEmpty() && pq.peek() >= A) { // 다솜이 표가 가장 많아질 때까지
			pq.add(pq.poll() -1); // poll: 첫 번째 값 반환, 가장 표 많은 후보의 투표자 1명 매수(표 감소)
			++A; // 다솜이 표 증가
			++cnt; // 매수한 사람 수 증가
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
