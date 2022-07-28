import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] result = {};

        // 1, 2, 3, 4, 5
        int[] first = {1, 2, 3, 4, 5};
        // 2, 1, 2, 3, 2, 4, 2, 5
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        // 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        HashMap<Integer, Integer> students = null;
        students = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            students.put(i + 1, 0);
        }

        int firstIndex = 0;
        int secondIndex = 0;
        int thirdIndex = 0;
        for (int nIndex = 0; nIndex < answers.length; nIndex++) {
            if (answers[nIndex] == first[firstIndex]) {
                students.put(1, students.get(1) + 1);
            }
            if (answers[nIndex] == second[secondIndex]) {
                students.put(2, students.get(2) + 1);
            }
            if (answers[nIndex] == third[thirdIndex]) {
                students.put(3, students.get(3) + 1);
            }

            firstIndex++;
            secondIndex++;
            thirdIndex++;

            if (firstIndex == 5) firstIndex = 0;
            if (secondIndex == 8) secondIndex = 0;
            if (thirdIndex == 10) thirdIndex = 0;
        }

        int max = Math.max(students.get(1), Math.max(students.get(2), students.get(3)));

        ArrayList<Integer> list = null;
        list = new ArrayList<>();
        for (Integer key : students.keySet()) {
            if (max == students.get(key)) {
                list.add(key);
            }
        }

        result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}