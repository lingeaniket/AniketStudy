package LeetCodeProblems;

import java.util.Scanner;

public class MaximumStrongPairXORI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maximumStrongPairXor(arr));
    }
    public static int maximumStrongPairXor(int[] nums) {
        int maxRes = -1;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.max(nums[i], nums[j]) - Math.min(nums[i], nums[j]) <= Math.min(nums[i], nums[j])) {
                    int res = xor(nums[i], nums[j]);
                    if(res >= maxRes){
                        maxRes = res;
                    }
                }
            }
        }
        return maxRes;
    }

    public static int xor(int a, int b){
        return (a|b) & (~a | ~b);
    }
}
