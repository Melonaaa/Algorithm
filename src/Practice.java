import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//      ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]	["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        String[] result = p.solution(record);
        for (String r : result) {
            System.out.println(r);
        }
//        System.out.println(p.solution(record));
    }

    public String[] solution(String[] record) {
        String[] answer = null;

        String[][] data = new String[record.length][3];
        HashMap<String, String> userInfo = new HashMap<>();

        for (int nIndex = 0; nIndex < record.length; nIndex++) {
            String[] raw = record[nIndex].split(" ");

            if (raw[0].equals("Leave")) {
                data[nIndex][0] = raw[0];
                data[nIndex][1] = raw[1];
            } else {
                data[nIndex][0] = raw[0];
                data[nIndex][1] = raw[1];
                data[nIndex][2] = raw[2];
                userInfo.put(raw[1], raw[2]);
            }
        }

        for (int nIndex = 0; nIndex < data.length; nIndex++) {
            data[nIndex][2] = userInfo.get(data[nIndex][1]);
        }

        ArrayList<String> result = new ArrayList<>();
        for(int nIndex = 0; nIndex < data.length; nIndex++){
            if(data[nIndex][0].equals("Enter")){
                result.add(data[nIndex][2] + "님이 들어왔습니다.");
            }else if(data[nIndex][0].equals("Leave")){
                result.add(data[nIndex][2] + "님이 나갔습니다.");
            }
        }

        answer = new String[result.size()];
        answer = result.toArray(answer);

        return answer;
    }
}