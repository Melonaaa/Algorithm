public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int n = 3;

        String result = p.solution(n);

        System.out.println(result);
    }

    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            answer += (i % 2 == 1) ? "수" : "박";
        }

        return answer;
    }
}