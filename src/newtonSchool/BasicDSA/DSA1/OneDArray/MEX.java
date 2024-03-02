package newtonSchool.BasicDSA.DSA1.OneDArray;

import java.util.HashSet;
import java.util.Scanner;

public class MEX {
    public static long findMEX(long[] arr, int K, int N) {
        // Arrays.sort(arr);
        HashSet<Long> hs = new HashSet<>();
        for(int i=0; i<N; i++){
            hs.add(arr[i]);
        }
        long ans = 0;
        for(long i=0; i<(2*N); i++){
            if(!hs.contains(i)){
                if(K > 0){
                    ans = i;
                    K--;
                } else{
                    ans = i;
                    break;
                }
            }
        }

//        if(ans < arr[N-1]){
//            if(ans+1 != arr[N-1]){
//                return ans;
//            } else{
//                return arr[N-1]+1;
//            }
//        } else if(ans == arr[N-1]) {
//            return arr[N-1]+1;
//        } else {
//            return ans;
//        }

         return ans;

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            long[] arr = new long[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextLong();
            }
            System.out.println(findMEX(arr, K,N));
        }
    }
}
