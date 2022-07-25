
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        3 5 12
//        3 3 3
//        5 3 12
        int a = 5;
        int b = 3;

        int result = p.solution(a, b);
        System.out.println(result);
    }

    public int solution(int a, int b) {
        int answer = 0;

        int start = 0;
        int end = 0;
        if( a > b ){
            start = b;
            end = a;
        }else{
            start = a;
            end = b;
        }

        for(int number = start; number <= end; number++){
            answer += number;
        }

        return answer;
    }
}