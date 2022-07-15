import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();

        int[] numbers = {1,2,3,4,6,7,8,0};

        System.out.println(p.solution(numbers));
    }

    public int solution(int[] numbers) {
        int answer = 0;

        boolean[] isChecked = new boolean[10];

        for(int number : numbers){
            isChecked[number] = true;
        }

        for(int nIndex = 0; nIndex < 10; nIndex++){
            if(!isChecked[nIndex]){
                answer += nIndex;
            }
        }

        return answer;
    }
}