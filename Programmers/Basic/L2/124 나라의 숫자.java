class Solution {
    public String solution(int n) {
        String answer = "";

        String[] numbers = {"4", "1", "2"};

        int remainder = 0;
        while(n > 0){
            remainder = n % 3;
            n /= 3;

            answer = numbers[remainder] + answer;
            if(remainder == 0){
                n -= 1;
            }
        }

        return answer;
    }
}