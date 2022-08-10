import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;

        String ternary = "";
        while( n > 0 ){
            int remainder = n % 3;
            ternary += remainder;

            n /= 3;
        }

        for(int i = ternary.length()-1; i >= 0; i--){
            int num = ternary.charAt(i) - '0';
            answer += (num * Math.pow(3, (ternary.length() - 1) - i));
        }

        System.out.println(answer);

        return answer;
    }
}