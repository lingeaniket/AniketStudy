package LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxFrequencyElements(nums));

    }
    public static int maxFrequencyElements(int[] nums) {
        // [1,2,3,4,5,6,1,2]
//        int freq = 0;
//        HashMap<Integer, Integer> frequency = new HashMap<>();
//        HashMap<Integer, Integer> count = new HashMap<>();
//
//        for(int i=0; i<nums.length; i++){
//            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0)+1);
//
//            if(frequency.get(nums[i])> freq){
//                freq = frequency.get(nums[i]);
//            }
//            count.put(frequency.get(nums[i]), count.getOrDefault(frequency.get(nums[i]), 0)+1);
//        }
//        return freq* count.get(freq);

        // or


                Map<Integer, Integer> map = new HashMap<>();

                int max = 0;
                int count = 0;

                for (int i = 0; i < nums.length; i++) {
                    if (map.containsKey(nums[i])) {
                        map.put(nums[i], map.get(nums[i])+1);
                    } else {
                        map.put(nums[i], 1);
                    }
                }

                for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    int value = entry.getValue();
                    if (value > max) {
                        max = value;
                    }
                }

                for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    int value = entry.getValue();
                    if (value == max) {
                        count++;
                    }
                }
                return count*max;
    }
}
