import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] numbers = {1,1,1,1,1};
        int target = 3;

        int result = p.solution(numbers, target);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    static int answer = 0;

    public int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(sum == target) answer++;
        }else{
            dfs(numbers, depth+1, target, sum + numbers[depth]);
            dfs(numbers, depth+1, target, sum - numbers[depth]);
        }
    }
}