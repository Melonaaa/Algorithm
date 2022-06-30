public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};

        System.out.println(p.solution(numbers, "right"));
        System.out.println(p.solution(numbers2, "left"));
    }

    String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftIndex = 10;
        int rightIndex = 12;

        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                leftIndex = number;
                sb.append("L");
            }else if(number == 3 || number == 6 || number == 9){
                rightIndex = number;
                sb.append("R");
            }else{
                int leftDist = getDistance(leftIndex, number);
                int rightDist = getDistance(rightIndex, number);

                if(leftDist < rightDist){
                    leftIndex = number;
                    sb.append("L");
                }else if(leftDist > rightDist){
                    rightIndex = number;
                    sb.append("R");
                }else{
                    if(hand.equals("left")){
                        leftIndex = number;
                        sb.append("L");
                    }else{
                        rightIndex = number;
                        sb.append("R");
                    }
                }
            }
        }

        return sb.toString();
    }

    private int getDistance(int currIndex, int number) {
        currIndex = (currIndex == 0) ? 11 : currIndex;
        number = (number == 0) ? 11 : number;

        int currX = (currIndex - 1) / 3;
        int currY = (currIndex - 1) % 3;

        int numX = (number - 1) / 3;
        int numY = 1;

        return Math.abs(currX - numX) + Math.abs(currY - numY);
    }
}


