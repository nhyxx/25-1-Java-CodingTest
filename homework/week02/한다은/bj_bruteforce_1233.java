// 주사위 - 인터넷 보고 함
package homework.week02;

import java.io.*;
import java.util.StringTokenizer;

public class bj_bruteforce_1233 {
    // 가능한 합의 개수 = 최대합 - 최소합 + 1
    // = (s1+s2+s3)-3(모든 주사위의 값이 1인 경우)+1 = (s1+s2+s3)-2
    // -> 가능한 합의 개수로 주사위 눈의 합을 저장할 배열을 만들어 주자
    public static void main(String[] args) throws IOException {
        // 데이터 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s1 = Integer.parseInt((st.nextToken()));
        int s2 = Integer.parseInt((st.nextToken()));
        int s3 = Integer.parseInt((st.nextToken()));

        // 배열 선언
        int[] arr = new int[(s1+s2+s3)-2];

        // 개수를 저장하기 위한 반복문
        for (int i=1; i<=s1; i++){ // s1
            for (int j=1; j<=s2; j++){
                for (int k=1; k<s3; k++){
                    int sum = i + j + k;
                    arr[sum-3]++;
                    // (1, 1, 1)의 합을 0번째 인덱스에 저장, (1, 1, 2)의 합을 1번째 인덱스에 저장..
                }
            }
        }

        int max = 0;
        int result = 0;

        // 최댓값이 갱신될때마다 max에 인덱스에 저장된 값과 result에 인덱스 값+3을 저장.
        for(int i = 0; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
                result = i+3;
            }
        }
        System.out.println(result);
    }
}
