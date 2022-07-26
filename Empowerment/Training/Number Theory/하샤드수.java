
public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int arr = 13;

        boolean result = p.solution(arr);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public boolean solution(int arr) {
        boolean answer = false;

        String[] str = String.valueOf(arr).split("");

        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }

        answer = arr % sum == 0 ? true : false;

        return answer;
    }

}