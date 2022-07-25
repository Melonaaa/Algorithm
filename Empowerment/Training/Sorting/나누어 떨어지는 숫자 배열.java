import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        int[] arr = {5, 9, 7, 10};
//        int divisor = 5;
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        int[] result = p.solution(arr, divisor);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
//        System.out.println(result);
    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }

        Collections.sort(list);

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}