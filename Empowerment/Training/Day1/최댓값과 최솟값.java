import java.util.ArrayList;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String s = "1 2 3 4";

        String result = p.solution(s);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        answer = Collections.min(list) + " " + Collections.max(list);

        return answer;
    }
}