import groovy.console.ui.SystemOutputInterceptor;

import java.util.Arrays;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        long n = 118372;

        long result = p.solution(n);

        System.out.println(result);
    }

    public long solution(long n) {
        long answer = 0;

        String str = "" + n;

        String[] arr = str.split("");
        Integer arr2[] = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr2, Collections.reverseOrder());

        String result = "";
        for (int i = 0; i < arr2.length; i++) {
            result += arr2[i];
        }

        answer = Integer.parseInt(result);

        return answer;
    }
}