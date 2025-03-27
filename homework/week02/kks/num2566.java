package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1; // 배열에 0이 들어갈 수 있으니 -1로 초기화
        int row = 0;
        int col = 0;
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);

        br.close();
    }
}
