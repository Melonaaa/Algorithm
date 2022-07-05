public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();

        // [1,2,3,4]	[-3,-1,0,2]	3
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(p.solution(a, b));
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int nIndex = 0; nIndex < a.length; nIndex++){
            answer += (a[nIndex] * b[nIndex]);
        }

        return answer;
    }
}