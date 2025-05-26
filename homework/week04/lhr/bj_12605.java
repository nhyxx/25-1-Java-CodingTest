
import java.util.*;

public class bj_12605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> str = new Stack<>(); 
		
		int N = sc.nextInt();
		sc.nextLine(); // 입력된 개행문자(\n)까지 읽기 

		for (int i=0; i<N; i++) {
			String test = sc.nextLine();
            StringTokenizer st = new StringTokenizer(test);
			
            while (st.hasMoreTokens()) { // 더 이상 단어가 없을 때까지
                str.push(st.nextToken());
            }
            
            System.out.print("Case #" + (i+1) + ":");
            while (!str.isEmpty()) {
                System.out.print(" " + str.pop());
            }
            System.out.println();
        }
        sc.close();
			
		
	}

}
