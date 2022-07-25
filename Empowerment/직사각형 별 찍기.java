
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        p.solution(n, m);
    }

    public void solution(int n, int m) {
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}