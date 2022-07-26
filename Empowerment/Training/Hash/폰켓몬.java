import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] nums = {3,1,2,3};

        int result = p.solution(nums);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(int[] nums) {
        int answer = 0;

        int N = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
            if(set.size() >= N) break;
        }

        answer = set.size();

        return answer;
    }

}