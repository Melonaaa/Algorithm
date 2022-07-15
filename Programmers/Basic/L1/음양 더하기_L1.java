import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();

        // [4,7,12]	[true,false,true]	9
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        System.out.println(p.solution(absolutes, signs));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int nIndex = 0; nIndex < signs.length; nIndex++) {
            if (signs[nIndex]) {
                answer += absolutes[nIndex];
            } else {
                answer -= absolutes[nIndex];
            }
        }

        return answer;
    }
}