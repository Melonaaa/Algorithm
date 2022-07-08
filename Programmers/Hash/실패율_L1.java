import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//        4 [4,4,4,4,4]	   [4,1,2,3]
        int N = 2;
        int[] stages = {1, 1};

        for(int rank : p.solution(N, stages)){
            System.out.print(rank + " ");
        }
        System.out.println();
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        Map<Integer, Float> failureRateMap = null;

        failureRateMap = new HashMap<>();
        for(int nStage = 1; nStage <= N; nStage++){
            int reachedPlayer = 0;
            int failedPlayer = 0;
            float failureRate = 0.0f;
            for(int currPlayerLocation : stages){
                if( nStage == currPlayerLocation){
                    reachedPlayer++;
                    failedPlayer++;
                }
                if(nStage < currPlayerLocation){
                    reachedPlayer++;
                }
            }
            if(reachedPlayer == 0){
                failureRate = 0.0f;
            }else{
                failureRate = (float)failedPlayer / reachedPlayer;
            }
            failureRateMap.put(nStage, failureRate);
        }

        List<Map.Entry<Integer, Float>> entryList = null;
        entryList = new LinkedList<>(failureRateMap.entrySet());
        entryList.sort(((o1, o2) -> Float.compare(o2.getValue(), o1.getValue())));

        answer = new int[entryList.size()];
        int nIndex = 0;
        for(Map.Entry<Integer, Float> entry : entryList){
            answer[nIndex++] = entry.getKey();
        }

        return answer;
    }
}