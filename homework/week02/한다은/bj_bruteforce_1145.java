// 적어도 대부분의 배수
// 입력 중 제일 세 번째로 큰 수 기준으로 1씩 늘려가면서 3개 이상 나누어떨어지는지 확인
// 정렬 -> 3번째 요소 가져와서 1씩 증가시키기?
package homework.week02;

import java.util.Arrays;
import java.util.Scanner;

public class bj_bruteforce_1145 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 길이 5인 배열 선언
        Scanner sc = new Scanner(System.in);

        // 배열에 입력값 넣기
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 정렬

        // 세 번째로 작은 수(인덱스 2)에서부터 1씩 증가시키면서 가장 작은 대부분의 배수 찾기
        int num = arr[2]; // 세 번째로 작은 수부터 출발
        while (true){
            int cnt = 0; // 나누어떨어지는 횟수 카운트
            for (int i=0; i<arr.length; i++){
                if (num % arr[i] ==0){
                    cnt++;
                }
            }
            if (cnt>=3){
                System.out.println(num);
                break;
            }
            num++; // 대부분의 배수가 아니면 num 1증가시키고 앞의 과정 반복
        }

    }
}
