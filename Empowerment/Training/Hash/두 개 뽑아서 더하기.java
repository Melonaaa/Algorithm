import java.util.HashSet;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] numbers = {2,1,3,4,1};

        int[] result = p.solution(numbers);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
//        System.out.println(result);
    }

    public int[] solution(int[] numbers) {
        int[] answer = {};

        HashSet<Integer> hashset = new HashSet<>();
        for (int n = 0; n < numbers.length; n++) {
            for (int m = 0; m < numbers.length; m++) {
                if(n == m) continue;
                else hashset.add(numbers[n] + numbers[m]);
            }
        }

        answer = hashset.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

}