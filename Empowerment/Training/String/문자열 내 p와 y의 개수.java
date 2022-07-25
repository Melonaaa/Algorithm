public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String s = "aaa";

        boolean result = p.solution(s);

        System.out.println(result);
    }

    public boolean solution(String s) {
        boolean answer = false;

        int p_cnt = 0;
        int y_cnt = 0;
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if(str[i].equalsIgnoreCase("p")) p_cnt++;
            else if(str[i].equalsIgnoreCase("y")) y_cnt++;
        }

        if(p_cnt == y_cnt) return true;
        else return false;
    }
}