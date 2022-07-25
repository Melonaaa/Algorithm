
import java.awt.font.NumericShaper;
import java.sql.ResultSet;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int x = 2;
        int n = 5;

        int[] result = p.solution(x, n);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ",");
        }
        System.out.println();
    }

    public int[] solution(int x, int n) {
        int[] answer = new int[n];

        for(int number = 1; number <= n; number++){
            answer[number-1] = x * number;
        }

        return answer;
    }
}