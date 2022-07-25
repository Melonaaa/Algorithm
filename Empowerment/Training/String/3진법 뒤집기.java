public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int n = 125;

        int result = p.solution(n);

        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;

        String str = "";
        while(n > 0){
            str += (n % 3);
            n /= 3;
        }
        answer = Integer.parseInt(str, 3);

        return answer;
    }
}