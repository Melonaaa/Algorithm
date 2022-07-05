import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//        [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = p.solution(array, commands);
        for(int r : result){
            System.out.print(r + ", ");
        }
        System.out.println();
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        ArrayList<Integer> nArr = null;
        int index = 0;
        for(int[] command : commands){
            int start = command[0]-1;
            int end = command[1];
            int selected = command[2]-1;

            nArr = new ArrayList<>();
            for(int nIndex = start; nIndex < end; nIndex++){
                nArr.add(array[nIndex]);
            }

            Collections.sort(nArr);

            answer[index++] = nArr.get(selected);
        }
        return answer;
    }
}