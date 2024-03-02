package LeetCodeProblems;

import java.util.Scanner;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(findMaxAverage(arr, k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        maxSum = sum;

        int i= 0;
        int j=k;
        while(j<nums.length){
            sum -= nums[i];
            sum+= nums[j];
            if(sum >= maxSum){
                maxSum = sum;
            }
            i++;
            j++;
        }

        return maxSum/k;
    }
}
