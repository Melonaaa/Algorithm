import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        13 17 43
        int left = 13;
        int right = 17;

        System.out.println(p.solution(left, right));
    }

    public int solution(int left, int right) {
        int answer = 0;

        for (int start = left; start < right+1; start++){
            int num = start;
            int divisorCnt = 0;
            for(int i = 1; i < num+1; i++){
                if(num % i == 0){
                    divisorCnt++;
                }
            }
            if(divisorCnt % 2 == 0){
                answer += num;
            }else{
                answer -= num;
            }
        }

        return answer;
    }
}