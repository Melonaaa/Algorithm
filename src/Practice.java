public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.solution(9));
    }

    int solution(int n) {
        int result = 0;
        int count = getBinaryCount(n);
        for (int i = 1; i < n; i++) {
            if(count==getBinaryCount(i)){
                result++;
            }
        }
        return result;
    }

    private int getBinaryCount(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count = count + 1;
            }
        }
        return count;
    }
}


