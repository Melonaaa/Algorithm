import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        5	[2, 4]	[1, 3, 5]	5
//        5	[2, 4]	[3]	4
        int n = 5;
        int[] lost = {2, 3};
        int[] reserve = {3, 4};

        System.out.println(p.solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int count = 0;
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]){
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        return n - lost.length + count;
    }
}