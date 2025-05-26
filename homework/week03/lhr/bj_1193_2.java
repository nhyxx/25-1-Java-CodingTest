import java.util.*;
 
public class bj_1193_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int count = 0;
		int i = 1;
		int deno = 0; // 분모
		int numer = 0; // 분자
		
		while(count < x) {
			count = count + i;
			i++;
		}
        
		if((i-1)%2 == 0) {
			deno = 1 + (count - x);
			numer = (i-1) - (count-x);
		}else {
			deno = (i-1) - (count-x);
			numer = 1 + (count - x);
		}
		
		
		System.out.println(numer  + "/" + deno);
    }
}