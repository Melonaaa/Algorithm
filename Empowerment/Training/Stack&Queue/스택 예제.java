import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        int[] arr = {8, 4, 3, 6};
        int[] arr = {1, 9, 5, 2, 7};
        int n = 2;

        int[] result = p.solution(arr, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
//        System.out.println(result);
    }

    public int[] solution(int[] array, int n) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.add(array[i]);
        }

        if(n==1) stack.pop();

        answer = new int[stack.size()];
        int i = stack.size()-1;
        while (!stack.isEmpty()){
            answer[i--] = stack.pop();
        }

        return answer;
    }
}