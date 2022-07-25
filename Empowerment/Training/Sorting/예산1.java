import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] d = {1,3,2,5,4};
        int budget = 9;

        int result = p.solution(d, budget);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int cnt = 0;
        for (int i = 0; i < d.length; i++) {
            if(d[i] > budget) break;
            else{
                budget -= d[i];
                cnt++;
            }
        }

        answer = cnt;

        return answer;
    }
}