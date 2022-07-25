import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int result = p.solution(sizes);

        System.out.println(result);
    }

    public int solution(int[][] sizes) {
        int answer = 0;

        int max = 0;
        int min = 0;
        for(int row = 0; row < sizes.length; row++){
            max = Math.max(max, Math.max(sizes[row][0], sizes[row][1]));
            min = Math.max(min, Math.min(sizes[row][0], sizes[row][1]));
        }

        answer = max * min;

        return answer;
    }
}