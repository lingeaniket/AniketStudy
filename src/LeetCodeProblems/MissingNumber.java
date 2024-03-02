package LeetCodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
    //[9,6,4,2,3,5,7,0,1]
    public static int missingNumber(int[] nums) {
//        int max = nums.length;
//        HashSet<Integer> hs = new HashSet<>();
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] == max){
//                max--;
//                while(hs.contains(max)){
//                    max--;
//                }
//            }
//            hs.add(nums[i]);
//        }
//        return max;

        //OR
        int sum = 0;
        int numsSum =0;
        for(int i=0; i<nums.length; i++){
            sum = sum + i+1;
            numsSum = numsSum + nums[i];

        }
        return sum - numsSum;
    }

}
