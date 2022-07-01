import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();

        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(p.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> basket = new Stack<>();

        for(int move : moves){
            move -= 1;
            for(int i = 0; i < board.length; i++){
                if(board[i][move] != 0){
                    if(basket.isEmpty()){
                        basket.add(board[i][move]);
                    }else{
                        if(basket.peek() == board[i][move]){
                            basket.pop();
                            answer += 2;
                        }else{
                            basket.add(board[i][move]);
                        }
                    }
                    board[i][move] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}


