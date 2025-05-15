// 팩토리얼
package homework.week05;
import java.util.*;

public class bj_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        while (num>1){
            fact *= num;
            num--;
        }
        System.out.println(fact);
    }
}
