import java.net.InetSocketAddress;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] result = p.solution(arr);

        for (int n = 0; n < result.length; n++) {
            System.out.print(result[n] + " ");
        }
        System.out.println();
    }

    public int[] solution(int[] arr) {
        int[] answer = null;

        ArrayList<Integer> list = new ArrayList<>();

        for(int n = 0; n < arr.length; n++){
            int number = arr[n];
            if(n == 0 || arr[n-1] != arr[n]){
                list.add(arr[n]);
            }else if(arr[n-1] == arr[n]) continue;
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}