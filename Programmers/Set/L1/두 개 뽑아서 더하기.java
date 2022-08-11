import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        TreeSet<Integer> result = new TreeSet<Integer>();

        for(int first = 0; first < numbers.length; first++){
            for(int second = first + 1; second < numbers.length; second++){
                result.add(numbers[first] + numbers[second]);
            }
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}