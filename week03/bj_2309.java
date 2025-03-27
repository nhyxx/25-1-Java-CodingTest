package week03;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int[] finalarr = new int[9];

        int total = 0;

        for(int i = 0; i<9; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int lie1 = 0;
        int lie2 = 0;

        for(int i=0; i<9; i++) {
            for (int j=i+1; j<9; j++){
                if (total - arr[i] - arr[j] == 100){
                    lie1 = arr[i];
                    lie2 = arr[j];
                }
            }
        }

        for(int i = 0; i<9; i++){
            if(arr[i] == lie1 || arr[i] == lie2) continue;
            else finalarr[i] = arr[i];
        }

        Arrays.sort(finalarr);

        for (int num : finalarr){
            if (num != 0) System.out.println(num);
        }

    }
}
