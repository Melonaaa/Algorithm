
import java.sql.ResultSet;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        3 20 4 10
        int[] arr = {1,2,3,4};

        double result = p.solution(arr);
        System.out.println(result);
    }

    public double solution(int[] arr) {
        double answer = 0.0f;

        int sum = 0;
        for(int n = 0; n < arr.length; n++){
            sum += arr[n];
        }

        answer = (double)sum / arr.length;

        return answer;
    }
}