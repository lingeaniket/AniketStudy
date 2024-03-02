package newtonSchool.ADVDSA.BackTracking;

import java.util.*;

public class KthPermutation1 {
    public static String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<n; i++) {
            fact = fact *i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans=  "";
        k= k-1;
        while(true) {
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);
            if(numbers.size() == 0) {
                break;
            }
            k= k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }
    /*
    My Imagine Code

    public static String minNum(int[] per, int[] arr, int idx, long K, int N) {

        String str="";
        if(K-1==0 || idx<0) {
            for(int i=0; i<arr.length; i++) {
                str += String.valueOf(arr[i]);
            } //123456789101113151214
        } else {
            if(arr[idx] >= N) {
                return minNum(per, arr, --idx, K, N);
            } else if(arr[idx]<N) {
                HashSet<Integer> hs = new HashSet<>();
                for(int i=0; i<idx; i++) {
                    hs.add(arr[i]);
                }
                int count=0;
                int m=1;
                while(arr[idx]+m<=N){
                    int k= arr[idx]+m;
                    if(!hs.contains(k)) {
                        arr[idx] = arr[idx]+m;
                        hs.add(arr[idx++]);
                        count++;
                        break;
                    } else {
                        m++;
                    }
                }
                if(count==0) {
                    return minNum(per, arr, --idx, K, N);
                } else {
                    for(int i = 0; i < per.length; i++) {
                        if (!hs.contains(per[i])) {
                            if(idx+1<=arr.length) {
                                arr[idx++] = per[i];
                            }
                        }
                    }
                    return minNum(per, arr, --idx, --K, N);
                }
            }
        }
        return str;
    }
    public static int fact(int N) {
        if(N==0) {
            return 1;
        } else {
            return (N*fact(N-1));
        }
    }
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int K= sc.nextInt();
        /*
        int[] per = new int[N];
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            per[i] = i+1;
            arr[i] = i+1;
        }

         */
        //System.out.println(fact(N));
        //System.out.println(minNum(arr, per, per.length-1, K, N));
        System.out.println(getPermutation(N, K));
    }
}
