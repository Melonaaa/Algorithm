
import groovy.console.ui.SystemOutputInterceptor;

import java.awt.font.NumericShaper;
import java.sql.ResultSet;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();

        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        int[][] result = p.solution(arr1, arr2);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result.length; j++){
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1.length];

        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr2.length; col++){
                answer[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        return answer;
    }
}