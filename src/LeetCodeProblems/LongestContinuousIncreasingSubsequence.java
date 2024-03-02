package LeetCodeProblems;

import java.util.Scanner;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findLengthOfLCIS(arr));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int last = nums[0];
        int mxRange = 1;
        int range =  1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > last){
                range++;
            } else {
                if(range > mxRange){
                    mxRange = range;
                }
                range = 1;
            }
            last = nums[i];
        }
        if(range > mxRange){
            mxRange = range;
        }
        return mxRange;
    }
}
