package LeetCodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class FindMissingandRepeatedValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] grid = new int[n][n];
        for(int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int[] ans = findMissingAndRepeatedValues(grid);
        for(int i=0; i<2; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum = 0, sqrSum = 0, n = grid.length, N = n*n;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                sum += grid[i][j];
                sqrSum += grid[i][j] * grid[i][j];
            }
        }
        long c1 = sum - N * (N + 1)/2,  c2 = sqrSum - N*(N+1)*(2*N + 1)/6;
        return new int[]{(int)(c2/c1 + c1)/2, (int)(c2/c1 - c1)/2};
    }
}
