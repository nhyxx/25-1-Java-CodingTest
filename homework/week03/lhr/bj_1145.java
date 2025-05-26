import java.util.*;

public class bj_1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int ret = Integer.MAX_VALUE;

        // 배열에서 3개씩 선택하여 최소 공배수를 계산
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int lcm = lcm(arr[i], lcm(arr[j], arr[k]));
                    ret = Math.min(ret, lcm);
                }
            }
        }

        System.out.println(ret);
    }

    // 최대공약수(GCD) 계산
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소공배수(LCM) 계산
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}

