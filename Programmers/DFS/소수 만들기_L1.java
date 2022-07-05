public class Practice {
    public int answer = 0;

    public static void main(String[] args) {
        Practice p = new Practice();

        // [1,2,3,4]	1
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 7, 6, 4};

        System.out.println(p.solution(nums));
        System.out.println(p.solution(nums2));
    }

    public int solution(int[] nums) {
        answer = 0;

        boolean[] visited = new boolean[nums.length];

        combination(nums, visited, 0,0, 3);

        return answer;
    }

    public void combination(int[] nums, boolean[] visited, int start, int dep, int len) {
        if (dep == len) {
            int sum = 0;
            for (int nIndex = 0; nIndex < visited.length; nIndex++) {
                if (visited[nIndex]) {
                    sum += nums[nIndex];
                }
            }
            if (isPrime(sum)) {
                answer += 1;
            }
            return;
        }

        for(int nIndex = start; nIndex < nums.length; nIndex++){
            if(!visited[nIndex]){
                visited[nIndex] = true;
                combination(nums, visited, nIndex+1, dep+1, len);
                visited[nIndex] = false;
            }
        }
    }

    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
//        System.out.println("소수 : " + num);
        return true;
    }
}