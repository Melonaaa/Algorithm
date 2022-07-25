import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        // n : 3
        // n : 4
        int n = 4;

        String result = p.solution(n);
        System.out.println(result);
    }

    public String solution(int n) {
        String answer = "";

        answer = n % 2 == 0 ? "Even" : "Odd";

        return answer;
    }
}