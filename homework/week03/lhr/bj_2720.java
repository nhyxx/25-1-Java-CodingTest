import java.util.*;

public class bj_2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			int C = sc.nextInt();
			
			int quarter = 25;
			int dime = 10;
			int nickel = 5;
			int penny = 1;
			
			int Q = C / quarter;
            C %= quarter;
            int D = C / dime;
            C %= dime;
            int N = C / nickel;
            C %= nickel;
            int P = C / penny;
			
            System.out.println(Q + " " + D + " " + N + " " + P);
			
		}
		
	}
}
