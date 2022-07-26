
public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int n = 626331;

        int result = p.solution(n);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(long n) {
        int answer = 0;

        if (n == 1) return 0;

        for (int i = 0; i < 500; i++) {
            if (n == 1) break;
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            answer++;
        }

        if (n != 1) answer = -1;

        return answer;
    }
}