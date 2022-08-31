import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int a = 5;
        int b = 3;

        long result = p.solution(a, b);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public long solution(int a, int b) {
        long answer = 0;

        int start = 0;
        int end = 0;
        if( a > b ){
            start = b;
            end = a;
        }else{
            start = a;
            end = b;
        }

        for(int nIndex = start; nIndex <= end; nIndex++){
            answer += nIndex;
        }

        return answer;
    }
}