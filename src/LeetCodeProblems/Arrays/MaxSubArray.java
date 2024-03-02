package LeetCodeProblems.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(maxSubArray(arr)));
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums){
        return maxSubArrayHelper(nums, 0, nums.length - 1);
    }

    private static int maxSubArrayHelper(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = (left + right) / 2;

        int maxLeftSum = maxSubArrayHelper(nums, left, mid);
        int maxRightSum = maxSubArrayHelper(nums, mid + 1, right);
        int maxCrossSum = maxCrossingSum(nums, left, mid, right);

        return Math.max(maxLeftSum, Math.max(maxRightSum, maxCrossSum));
    }

    private static int maxCrossingSum(int[] nums, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = mid; i >= left; i--) {
            currentSum += nums[i];
            leftSum = Math.max(leftSum, currentSum);
        }

        int rightSum = Integer.MIN_VALUE;
        currentSum = 0;

        for (int i = mid + 1; i <= right; i++) {
            currentSum += nums[i];
            rightSum = Math.max(rightSum, currentSum);
        }

        return leftSum + rightSum;
    }
}

// -2 1 -3 4 -1 2 1 -5 4
// 5 4 -1 7 8
