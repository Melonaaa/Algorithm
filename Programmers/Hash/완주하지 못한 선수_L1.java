import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
//        ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
//        ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(p.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> mParticipant = new HashMap<>();

        for(String p : participant){
            mParticipant.put(p, mParticipant.getOrDefault(p, 0)+1);
        }

        for(String c : completion){
            mParticipant.put(c, mParticipant.get(c)-1);
        }

        for(String key : mParticipant.keySet()){
            if(mParticipant.get(key) > 0){
                answer = key;
            }
        }

        return answer;
    }
}