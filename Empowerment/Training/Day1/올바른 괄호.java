import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String s = "()()";

        boolean result = p.solution(s);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public boolean solution(String s) {
        boolean answer = false;

        if(s.charAt(0) == ')') return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && s.charAt(i) == ')')
                stack.pop();
            else if(s.charAt(i) == '(')
                stack.push(s.charAt(i));
        }

        answer = (stack.isEmpty()) ? true : false;

        return answer;
    }
}