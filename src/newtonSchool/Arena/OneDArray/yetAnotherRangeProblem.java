package newtonSchool.Arena.OneDArray;

import java.util.Scanner;

public class yetAnotherRangeProblem {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        long ans = 1000000*(100000+1)/2;
        long[] arr = new long[1000001];
        while(T-->0){
            int L = sc.nextInt();
            int R = sc.nextInt();
            for(int i= L; i<=R; i++){
                if(arr[i] != -1){
                    arr[i] = -1;
                    ans -= Long.valueOf(i);
                }

            }
        }
        System.out.println(ans);
    }
}
