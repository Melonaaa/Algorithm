public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String[] seoul = {"Jane", "Kim"};

        String result = p.solution(seoul);

        System.out.println(result);
    }

    public String solution(String[] seoul) {
        String answer = "";

        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                index = i;
                break;
            }
        }

        answer = "김서방은 " + index + "에 있다.";

        return answer;
    }
}