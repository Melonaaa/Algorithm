
public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int n = 2;
        int m = 5;

        int[] result = p.solution(n, m);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
//        System.out.println(result);
    }

    public int[] solution(int n, int m) {
        int gcm = 1;
        int lcm = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0 && m % i == 0) gcm = i;
        }

        lcm = n * m / gcm;

        int[] answer = {gcm, lcm};

        return answer;
    }
}