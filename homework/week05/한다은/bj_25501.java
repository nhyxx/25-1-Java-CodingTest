// 팰린드롬
package homework.week05;
import java.io.*;

public class bj_25501 {

    static int result;
    static int recursion(String s, int l, int r){
        result++; // 호출할 때마다 1증가
        if (l>=r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 반복횟수 받기(테스트케이스의 개수)
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++){
            result = 0;
            sb.append(isPalindrome(br.readLine())+ " "+ result+ "\n");
        }
        System.out.println(sb);

        br.close();

    }

}
