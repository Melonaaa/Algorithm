import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String str = "-1234";

        int result = p.solution(str);

        System.out.println(result);
    }

    public int solution(String str) {
        int answer = 0;

        answer = Integer.parseInt(str);

        return answer;
    }
}