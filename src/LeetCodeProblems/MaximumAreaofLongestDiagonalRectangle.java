package LeetCodeProblems;

import java.util.Scanner;

public class MaximumAreaofLongestDiagonalRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[2][sc.nextInt()];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                nums[i][j] = sc.nextInt();
            }
//            nums[i] = sc.nextInt();
        }
        System.out.println(areaOfMaxDiagonal(nums));
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int maxAr = 0;
        int maxDia = 0;
        for(int i=0; i<dimensions.length; i++){
            int l= dimensions[i][0], b = dimensions[i][1];
            int area = l*b;
            if((l*l + b*b) >=maxDia){
                maxAr = area;
                maxDia = l*l + b*b;
            }
        }
        return maxAr;
    }
}
