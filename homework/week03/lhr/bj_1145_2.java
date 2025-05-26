
import java.util.*;

public class bj_1145_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int cnt = 0;
		int ret = 1;
		
		for (int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		while (true) {
			cnt = 0;
			
			for (int j = 0; j<5; j++) {
				if (ret % arr[j] == 0) cnt ++;
			}
			
			if (cnt >= 3) break;
			
			ret ++;
		}
		System.out.print(ret);

	}

}


