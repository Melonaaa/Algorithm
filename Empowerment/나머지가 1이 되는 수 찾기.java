
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        10 3
//        12 11
        int n = 12;

        int result = p.solution(n);
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;

        for(int number = 1; number < n; number++){
            if(n % number == 1){
                answer = number;
                break;
            }
        }

        return answer;
    }
}