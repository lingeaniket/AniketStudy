package LeetCodeProblems;

import java.util.Scanner;

public class MinimumCostI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(minimumCost(nums));
    }
    public static int minimumCost(int[] nums) {
        int ans = nums[0];
        int pt2 = nums[nums.length - 2];
        int pt1 = nums[nums.length-1];
        // [2,16,50,35,42,11,27,24,48,4]
        for(int i= nums.length-3; i>=1; i--){
            if(nums[i]<= pt2){
                if(pt2 <=pt1){
                    pt1= pt2;
                }
                pt2 = nums[i];
            }
        }

        return ans+pt1+pt2;
    }
}
