import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        2	["N~F=0", "R~T>2"]	3648
//        2	["M~C<2", "C~M>1"]	0
        int n = 2;

        String[] data = {"N~F=0", "R~T>2"};

        int result = p.solution(n, data);
        System.out.println(result);
    }

    static String[] kakaoFriends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static boolean[] isVisited = null;
    static int cnt = 0;

    public int solution(int n, String[] data) {
        int answer = 0;

        isVisited = new boolean[kakaoFriends.length];
        cnt = 0;

        dfs("", data);

        answer = cnt;

        return answer;
    }

    public void dfs(String friends, String[] datas) {
        if (friends.length() == 8) {
            if (isCorrect(friends, datas))
                cnt++;
        }

        for (int nIndex = 0; nIndex < 8; nIndex++) {
            if (!isVisited[nIndex]) {
                isVisited[nIndex] = true;
                String names = friends + kakaoFriends[nIndex];
                dfs(names, datas);
                isVisited[nIndex] = false;
            }
        }
    }

    private boolean isCorrect(String friends, String[] datas) {
        for (var data : datas) {
            int sender = friends.indexOf(data.charAt(0));
            int receiver = friends.indexOf(data.charAt(2));
            char op = data.charAt(3);
            int distance = Character.getNumericValue(data.charAt(4));

            if (op == '=') {
                if (!(Math.abs(sender - receiver) == distance + 1)) return false;
            } else if (op == '<') {
                if (Math.abs(sender-receiver) >= distance + 1) return false;
            } else if (op == '>') {
                if (Math.abs(sender-receiver) <= distance + 1) return false;
            }
        }

        return true;
    }
}