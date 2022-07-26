
public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int left = 13;
        int right = 17;

        int result = p.solution(left, right);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(int left, int right) {
        int answer = 0;

        for (int number = left; number <= right; number++) {
            int cnt = 0;
            for (int i = 1; i <= number; i++) {
                if(number % i == 0) cnt++;
            }
            if(cnt % 2 == 0) answer += number;
            else answer -= number;
        }

        return answer;
    }
}