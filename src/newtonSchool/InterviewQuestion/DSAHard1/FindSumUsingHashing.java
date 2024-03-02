package newtonSchool.InterviewQuestion.DSAHard1;

import java.util.HashMap;
import java.util.HashSet;

public class FindSumUsingHashing {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int N = arr.length;
        int K = 2;
        int count=0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int m= K-arr[i];
            if(hs.containsKey(m)) {
                count = count + hs.get(m);
                hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
            } else{
                hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
            }
        }
        System.out.println(count);

    }
}
