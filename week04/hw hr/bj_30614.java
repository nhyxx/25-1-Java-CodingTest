import java.util.*;

public class bj_30614 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		int n = sc.nextInt();
		String str = sc.next();
		
		for (int i=0; i<n; i++) {
			char ch = str.charAt(i);
			
			if (Character.isLowerCase(ch)) { 
				stack.push(ch);
			} else { // 컨테이너 꺼내기 (대문자)
                if (stack.isEmpty() || stack.peek() != Character.toLowerCase(ch)) {
                    System.out.println(0); // 불안정한 경우 즉시 출력 후 종료
                    return;
                }
                stack.pop(); // 정상적으로 제거
            }
        }

        // 모든 컨테이너가 정상적으로 제거되었는지 확인
        System.out.println(stack.isEmpty() ? 1 : 0);
        sc.close();
    }
}