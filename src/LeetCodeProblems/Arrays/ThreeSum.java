package LeetCodeProblems.Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(threeSum(arr));
    }
        public static List<List<Integer>> threeSum(int[] nums) {
            int target = 0;
            Arrays.sort(nums);
            Set<List<Integer>> s = new HashSet<>();
            List<List<Integer>> output = new ArrayList<>();
            for (int i = 0; i < nums.length; i++){
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    } else if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
            output.addAll(s);
            return output;
        }
    }
    //-1 0 1 2 -1 -4 -2 -3 3 0 4

