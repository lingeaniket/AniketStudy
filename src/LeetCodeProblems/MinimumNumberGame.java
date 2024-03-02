package LeetCodeProblems;

import java.util.Scanner;

public class MinimumNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = numberGame(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(ans[i] +" ");
        }
    }
    public static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        sortArr(nums);
        int i=0;
        int k= 0;
        int j=1;
        while(j<nums.length){
            arr[k++] = nums[j];
            arr[k++] = nums[i];
            i+=2;
            j+=2;
        }
        return arr;
    }

    public static void sortArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            int idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]< arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
}
