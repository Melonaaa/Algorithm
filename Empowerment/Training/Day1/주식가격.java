
public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[] prices = {1, 2, 3, 2, 3};

        int[] result = p.solution(prices);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
//        System.out.println(result);
    }

    public int[] solution(int[] prices) {
        int[] answer = {};

        answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int time = 0;
            for (int j = i+1; j < prices.length; j++) {
                time++;
                if(price > prices[j]) break;
            }
            answer[i] = time;
        }

        return answer;
    }
}