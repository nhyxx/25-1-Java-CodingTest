package week02.homework;

import java.util.Scanner;

public class bj_1145 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int result = 0;
        for (int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; ; i++){
            int cnt = 0;
            for(int j = 0; j<5; j++){
                if(i%arr[j] == 0){
                    cnt++;
                    if(cnt==3) {
                        result = i;
                        System.out.println(result);
                        return;
                    }
                }
            }
        }

    }
}
