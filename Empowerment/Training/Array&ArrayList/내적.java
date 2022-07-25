
import java.sql.ResultSet;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        3 20 4 10
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        int result = p.solution(a, b);
        System.out.println(result);
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int n = 0; n < a.length; n++){
            answer += (a[n] * b[n]);
        }

        return answer;
    }
}