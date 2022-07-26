import java.util.HashMap;
import java.util.HashSet;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String result = p.solution(participant, completion);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashmap = new HashMap<>();
        for (int n = 0; n < participant.length; n++) {
            hashmap.put(participant[n], hashmap.getOrDefault(participant[n], 0)+1);
        }

        for (int n = 0; n < completion.length; n++) {
            hashmap.put(completion[n], hashmap.get(completion[n])-1);
        }

        for(String key : hashmap.keySet()){
            if(hashmap.get(key) > 0) answer += key;
        }

        return answer;
    }

}