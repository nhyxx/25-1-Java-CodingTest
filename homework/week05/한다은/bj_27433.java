// 팩토리얼 - 큰 수 팩토리얼(int, long)
package homework.week05;
import java.util.*;

public class bj_27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;

        while (n>1){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
