import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        String[] strings = {"sun", "bed", "car"};
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;

        String[] result = p.solution(strings, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
//        System.out.println(result);
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = null;

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1, strings[i].length());
        }

        answer = strings;

        return answer;
    }
}