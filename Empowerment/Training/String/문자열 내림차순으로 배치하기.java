import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String s = "Zbcdefg";

        String result = p.solution(s);

        System.out.println(result);
    }

    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");

        Arrays.sort(str);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }

        answer = sb.reverse().toString();

        return answer;
    }
}