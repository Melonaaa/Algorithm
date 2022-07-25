public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String s = "abcde";

        String result = p.solution(s);

        System.out.println(result);
    }

    public String solution(String s) {
        String answer = "";

        answer = (s.length() % 2 == 0) ? s.substring((s.length()/2)-1, (s.length()/2)+1) : s.substring(s.length()/2, (s.length()/2)+1);

        return answer;
    }
}