import java.util.*;

public class bj_1193 { // 이해가 안 됨..

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int crossCnt = 1;
		int preCntSum = 0;
		
		while (true) {
			if (X <= preCntSum + crossCnt) {
				if (crossCnt % 2 == 1) {
					System.out.print((crossCnt - (X - preCntSum -1)) + "/" + (X - preCntSum));
					break;
				} else {
					System.out.print((X - preCntSum) + "/" + (crossCnt - (X - preCntSum - 1)));
				}
			} else {
				preCntSum += crossCnt ;
				crossCnt++; 
				
			}
		}
	}

}
