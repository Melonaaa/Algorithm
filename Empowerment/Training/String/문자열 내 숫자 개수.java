import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String s = "1234";

        boolean result = p.solution(s);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6 ){
            for (int i = 0; i < s.length(); i++) {
                if(!Character.isDigit(s.charAt(i))){
                    answer = false;
                    break;
                }
            }
        }else{
            return false;
        }
        return answer;
    }
}