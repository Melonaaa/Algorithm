import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

//      6	4	[[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]]	[4, 5]
        int m = 6;
        int n = 4;

        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        int[] result = p.solution(m, n, picture);
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    static class Node {
        int x;
        int y;

        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static boolean[][] isVisited;
    static int cnt = 0;

    static Queue<Node> queue = new LinkedList<>();

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        isVisited = new boolean[m][n];

        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                if(isVisited[row][col] != true && picture[row][col] != 0){
                    cnt = 1;
                    bfs(picture, row, col);
                    numberOfArea++;

                    if(maxSizeOfOneArea < cnt){
                        maxSizeOfOneArea = cnt;
                    }
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    static void bfs(int[][] picture, int r, int c){
        queue.add(new Node(r, c));
        isVisited[r][c] = true;

        while(!queue.isEmpty()){
            Node curr = queue.poll();

            for(int dir = 0; dir < 4; dir++){
                int nx = curr.x + dx[dir];
                int ny = curr.y + dy[dir];

                if(nx >= 0 && nx < picture.length && ny >= 0 && ny < picture[0].length){
                    if(isVisited[nx][ny] != true && picture[nx][ny] == picture[r][c]){
                        queue.add(new Node(nx, ny));
                        isVisited[nx][ny] = true;
                        cnt++;
                    }
                }
            }
        }
    }
}