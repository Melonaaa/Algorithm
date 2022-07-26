import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int n = 12;

        int result = p.solution(n);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;


        for (int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }

        return answer;
    }
}