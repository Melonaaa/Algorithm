import java.util.*;

class Solution {
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