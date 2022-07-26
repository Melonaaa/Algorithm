
public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] nums = {1, 2, 3, 4};

        int result = p.solution(nums);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    static boolean[] isVisited = null;
    static int cnt = 0;

    public int solution(int[] nums) {
        int answer = 0;

        isVisited = new boolean[nums.length];

        dfs(0, 0,nums);

        answer = cnt;

        return answer;
    }

    private void dfs(int depth, int sum, int[] nums){
        if(depth == 3){
            System.out.println(sum);
            if(isPrime(sum)) cnt++;
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(!isVisited[i]){
                isVisited[i] = true;
                dfs(depth + 1, sum+nums[i], nums);
                isVisited[i] = false;
            }
        }
    }

    private boolean isPrime(int number){
        if( number == 0 || number == 1 ) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }

        return true;
    }
}