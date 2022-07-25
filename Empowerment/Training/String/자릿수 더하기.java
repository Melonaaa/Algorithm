public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int n = 123;

        int result = p.solution(n);

        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;

        String str = "" + n;

        for(int i = 0; i < str.length(); i++){
            answer += str.charAt(i) - '0';
        }

        return answer;
    }
}