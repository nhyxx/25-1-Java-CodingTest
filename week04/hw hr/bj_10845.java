import java.util.*;

public class bj_10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<n; i++) {
			String input = sc.nextLine(); // 문장 전체 읽기
			StringTokenizer st = new StringTokenizer(input);
			String cmd = st.nextToken(); // 띄어쓰기 앞 단어 읽기
			
			switch (cmd) {
				case "push":
					int num = Integer.parseInt(st.nextToken()); // 띄어쓰기 뒤 숫자
					q.add(num);
					break;
					
				case "pop":
					System.out.println(q.isEmpty()? -1 : q.poll());
					break;
					
				case "size":
					System.out.println(q.size());
					break;
					
				case "empty":
					System.out.println(q.isEmpty()? 1 : 0);
					break;
					
				case "front":
					System.out.println(q.isEmpty()? -1 : q.getFirst());
					break;
					
				case "back":
					System.out.println(q.isEmpty()? -1 : q.getLast());
					break;
			}
		}
		sc.close();
		
	}

}
