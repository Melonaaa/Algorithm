public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String phone_number = "027778888";

        String result = p.solution(phone_number);

        System.out.println(result);
    }

    public String solution(String phone_number) {
        String answer = "";

        String[] str = phone_number.split("");

        for (int i = 0; i < str.length; i++) {
            answer += (i < str.length - 4) ? "*" : str[i];
        }

        return answer;
    }
}