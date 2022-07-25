import groovy.console.ui.SystemOutputInterceptor;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        long n = 12345;

        int[] result = p.solution(n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public int[] solution(long n) {
        int[] answer = null;

        String str = "" + n;
        answer = new int[str.length()];

        for(int i = str.length()-1; i >= 0; i--){
            answer[str.length()-(i+1)] = str.charAt(i) - '0';
        }

        return answer;
    }
}