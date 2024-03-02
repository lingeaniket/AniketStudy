package LeetCodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(missingInteger(nums));
    }
    public static int missingInteger(int[] nums) {
//        if(nums.length == 1){
//            return nums[0]+1;
//        }
//        int nextNum = nums[0]+1;
//        HashSet<Integer> hs = new HashSet<>();
//        boolean seq = true;
//        hs.add(nums[0]);
//        int sum = nums[0];
//        for(int i=1; i<nums.length; i++){
//            hs.add(nums[i]);
//            if(seq){
//                if(nextNum == nums[i]){
//                    nextNum++;
//                    sum += nums[i];
//                } else {
//                    seq = false;
//                    while(hs.contains(sum)){
//                        sum++;
//                    }
//                }
//            } else {
//                while(hs.contains(sum)){
//                    sum++;
//                }
//            }
//        }
//
//        return sum;

        // or

        int[] freq = new int[51];
        for(var n: nums) ++freq[n];
        int sum = nums[0];
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] == nums[i-1] + 1) sum += nums[i];
            else break;
        }
        if(sum > 50) return sum;
        while(freq[sum] >= 1){
            ++sum;
            if(sum == 51) return sum;
        }
        return sum;
    }
}
