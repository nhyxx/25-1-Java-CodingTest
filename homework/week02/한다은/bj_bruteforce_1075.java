// 나누기
// 뒤 두 자리를 00으로 만든 다음 나누어떨어질때까지 1씩 증가시키면서 나누기
package homework.week02;

import java.util.Scanner;

public class bj_bruteforce_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); // 나눠지는 수
        int num2 = sc.nextInt(); // 나누는 수

        int n3 = (num1/100)*100; // 뒤의 두 자리 0으로 만들기

        while (n3 % num2 != 0){
            n3++;
        }

        System.out.printf("%02d\n", n3%100);


    }
}
