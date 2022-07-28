import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 4;

        int result = p.solution(arr, n);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start+end)/2;
//            System.out.println("접근 중간값 : " + arr[mid]);

            if(n == arr[mid]){
                return arr[mid];
            }else if(n > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }
}