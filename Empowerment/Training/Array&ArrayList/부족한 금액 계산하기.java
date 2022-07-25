
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        3 20 4 10
        int price = 3;
        int money = 20;
        int count = 4;

        int result = p.solution(price, money, count);
        System.out.println(result);
    }

    public int solution(int price, int money, int count) {
        int answer = 0;

        int charge = price;
        for(int n = 2; n <= count; n++){
            charge += (price * n);
        }

        if(money >= charge) answer = 0;
        else answer = charge - money;

        return answer;
    }
}