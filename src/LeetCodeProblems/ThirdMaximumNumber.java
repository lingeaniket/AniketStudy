package LeetCodeProblems;

import java.util.Scanner;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]< min) {
                min = nums[i];
            }
            if(nums[i]> firstMax) {
                thirdMax = secMax;
                secMax = firstMax;
                firstMax = nums[i];
            } else if(nums[i] < firstMax) {
                if(nums[i]> secMax) {
                    thirdMax = secMax;
                    secMax= nums[i];
                } else if(nums[i] < secMax) {
                    if(nums[i]> thirdMax) {
                        thirdMax = nums[i];
                    }
                }
            }
        }
        if(secMax == Integer.MIN_VALUE){
            return firstMax;
        }
        if(thirdMax == Integer.MIN_VALUE && min != thirdMax){
            return firstMax;
        }
        return thirdMax;
//        -47 > -48
        // min = -48


    }
}
