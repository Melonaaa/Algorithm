
import java.awt.font.NumericShaper;
import java.sql.ResultSet;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] numbers = {1,2,3,4,6,7,8,0};

        int result = p.solution(numbers);
        System.out.println(result);
    }

    public int solution(int[] numbers) {
        int answer = 0;

        boolean[] isChecked = new boolean[10];

        for(int n = 0; n < numbers.length; n++){
            isChecked[numbers[n]] = true;
        }

        for(int n = 0; n < isChecked.length; n++){
            if(!isChecked[n]) answer += n;
        }

        return answer;
    }
}