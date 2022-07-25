import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] arr = {4,3,2,1};

        int[] result = p.solution(arr);

        for(int n = 0; n < result.length; n++){
            System.out.print(result[n] + " ");
        }
        System.out.println();
    }

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if(arr.length == 1) {
            answer[0] = -1;
            return answer;
        }

        Arrays.sort(arr);

        for(int nIndex = 0; nIndex < answer.length; nIndex++){
            answer[nIndex] = arr[answer.length - nIndex];
        }

        return answer;
    }
}