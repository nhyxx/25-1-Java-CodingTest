package week1;

import java.util.Scanner;

public class bj_11720 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("n 입력");
            int n = sc.nextInt();
            System.out.println("스트링 입력");
            String input = sc.next();
            int sum = 0;

            for (char c : input.toCharArray()) {
                sum += Character.getNumericValue(c);
            } //문자-숫자 바꾸는 함수 잊지말기.

            System.out.println(sum);
        }
    }
