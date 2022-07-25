public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        String s = "23four5six7";

        int result = p.solution(s);

        System.out.println(result);
    }

    public int solution(String s) {
        int answer = 0;

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];

            s = s.replaceAll(number, String.valueOf(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}