package LeetCodeProblems;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int mainMax = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                max++;
            } else {
                if(max >= mainMax){
                    mainMax = max;
                }
                max=0;
            }
        }
        if(max >= mainMax){
            mainMax = max;
        }

        return mainMax;
    }
}
