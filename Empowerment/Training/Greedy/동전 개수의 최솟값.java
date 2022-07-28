import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int k = 4200;

        int result = p.solution(k);

//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
        System.out.println(result);
    }

    public int solution(int k) {
        int answer = 0;

        int[] coins = {1, 5, 10, 50, 100, 500};

        for (int nIndex = 0; nIndex < coins.length; nIndex++) {
            int coin = coins[coins.length - (1 + nIndex)];

            if(coin > k) continue;
            else{
                answer += k / coin;
                k %= coin;
            }

            if(k == 0) break;
        }
        return answer;
    }
}