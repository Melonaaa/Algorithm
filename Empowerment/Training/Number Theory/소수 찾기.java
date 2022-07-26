
public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int n = 5;

        int result = p.solution(n);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;

        for (int number = 2; number <= n; number++) {
            if(isPrime(number)) answer++;
        }

        return answer;
    }

    private boolean isPrime(int number){
        if(number == 2) return true;

        for (int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }

        return true;
    }
}