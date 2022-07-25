
import java.sql.ResultSet;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        3 20 4 10
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int result = p.solution(absolutes, signs);
        System.out.println(result);
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int n = 0; n < absolutes.length; n++){
            if(signs[n]){
                answer += absolutes[n];
            }else{
                answer -= absolutes[n];
            }
        }

        return answer;
    }
}