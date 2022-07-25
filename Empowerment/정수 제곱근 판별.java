import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        n : 121
//        n : 3
        int n = 121;

        long result = p.solution(n);
        System.out.println(result);
    }

    public long solution(int n) {
        long answer = 0;

        boolean isChecked = false;
        for(int number = 0; number < n; number++){
            if( number == Math.sqrt(n) ){
                answer = (number + 1) * (number + 1);
                isChecked = true;
                break;
            }
        }

        if(!isChecked) answer = -1;

        return answer;
    }
}