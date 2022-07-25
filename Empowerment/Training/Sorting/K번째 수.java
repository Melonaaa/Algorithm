import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = p.solution(array, commands);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
//        System.out.println(result);
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        answer = new int[commands.length];
        for (int n = 0; n < commands.length; n++) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int m = commands[n][0]-1; m < commands[n][1]; m++) {
                list.add(array[m]);
            }

            Collections.sort(list);

            answer[n] = list.get(commands[n][2]-1);
        }

        return answer;
    }
}