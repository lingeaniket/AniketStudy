package newtonSchool.Arena.OneDArray;

import java.util.Scanner;

public class circular_River {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int K = sc.nextInt();
        int N =sc.nextInt();
        int[] cities = new int[N];
        int ans =0;
        for(int i=0; i<N; i++){
            cities[i] = sc.nextInt();
            ans += cities[i];
        }

//        int ans =0;
        for(int i=0; i<N; i++){
            int rAns = minDist(K, cities, i);
            if(rAns<ans){
                ans = rAns;
            }
        }

        System.out.println(ans);
    }
    public static int minDist(int K, int[] arr, int idx){  // 0 5 15
        int ans =0;
        for(int i=idx; i<arr.length; i++){
            if(i != arr.length -1){
                ans += arr[i+1] - arr[i];
            } else if(idx != 0) {
                ans += K - arr[i];
            }
        }
        if(idx != 0){
            ans += arr[0];
        }

        for(int i=0; i<idx-1; i++){
                ans += arr[i+1] - arr[i];
        }

        return ans;
    }
}
