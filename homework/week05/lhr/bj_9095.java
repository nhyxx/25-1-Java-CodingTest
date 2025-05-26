import java.util.*;

public class bj_9095 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt(); // 테스트 케이스 개수
	        
	        for(int i = 0; i< num; i ++){
	            int N = sc.nextInt();
	            System.out.println(recursion(N));
	        }
	    }

	    private static int recursion(int n){
	        if(n == 1) {
	            return 1;
	        } else if (n == 2){
	            return 2;
	        } else if (n == 3) {
	            return 4;
	        } else if (n <= 0 ){
	            return 0;
	        } else {
	            return recursion(n-3) + recursion(n-2) + recursion(n-1);
	        }
	    }
}
