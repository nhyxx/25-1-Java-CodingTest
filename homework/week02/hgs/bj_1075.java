import java.util.Scanner;

public class bj_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();

        int x = (n / 100) * 100;  // 마지막 두 자리 없애기
        int result = 0;

        for (int i = x; i < x + 100; i++) {
            if (i % f == 0) {
                result = i;
                break;
            }
        }

        // 결과의 마지막 두 자리만 출력, 앞에 0 채워서 두 자릿수 유지
        System.out.printf("%02d\n", result % 100);
    }
}
