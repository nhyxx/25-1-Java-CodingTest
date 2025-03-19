package week1;

import java.util.Scanner;

public class bj_1929 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); //스트링빌더 애용하기...

        System.out.println("M 입력");
        int M = sc.nextInt();
        System.out.println("N 입력");
        int N = sc.nextInt();
        boolean[] prime = new boolean[N+1]; // 0~n개가 들어가는 boolean 배열의 체

        prime[0] = true;
        prime[1] = true; //0과 1은 소수가 아님> true로 초기화

        // 체 생성
        for(int i = 2; i*i < prime.length; i++) { //배수를 모두 체크하는 for.
            if(prime[i]) continue; //소수는 false로 컨티뉴.
            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true; //배수면 true로 넣음.
            }
        }
        //이중 for 문의 가로세로 구조를 기억하기.
        //2(4 6 8...) 3(6 9..) 이런 식으로 체크하게 됨.

        for(int i = M; i<=N; i++) {
            if(!prime[i]) {
                sb.append(i).append("\n"); //줄바꿈 어펜드 잊지말기.
            }
        }
        System.out.println(sb);
    }

}
