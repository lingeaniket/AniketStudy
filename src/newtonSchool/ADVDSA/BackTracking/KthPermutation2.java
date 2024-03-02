package newtonSchool.ADVDSA.BackTracking;

import java.math.BigInteger;
import java.util.Scanner;

public class KthPermutation2 {
    public static String solve(String ans, long[] fact, long[] digits, int n, long K) {
        if(n==1) {
            ans += digits[0];
            return ans;
        }
        int index = (int) (K/fact[n-1]);

        if(K%fact[n-1] ==0){
            index -=1;
        }
        ans += digits[index];

        long[] newDigits = new long[digits.length-1];
        for(int i=0, k=0; i<digits.length; i++) {
            if(i != index) {
                newDigits[k] = (int) digits[i];
                k++;
            }
        }
        K -= fact[n-1]*index;
        return solve(ans, fact, newDigits, n-1, K);
    }
    public static String getPermutation(int n, long K) {
        long[] fact = new long[n];
        long[] digits = new long[n];
        fact[0] = 1;
        int f =1;
        for(int i=1; i<n; i++) {
            f*=i;
            if(f>100000000) {
                f = 100000000;
                fact[i] = f;
            } else {
                fact[i] = f;
            }

        }
        /*
        0-1
        1-1
        2-2
        3-6
        4-24

         */
        int p=0;
        for(int i=1; i<=n; i++) {
            digits[p++] = i;
        }
        String ans = "";
        ans = solve(ans, fact, digits, n, K);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String str = sc.next();
        BigInteger bg = new BigInteger(str);
        long K=0;
        long num = bg.longValue();
        System.out.println(num);
        if( bg.longValue() <= 0) {
            K= 100000000;
            //Math.min(100000000, 100000000);
        } else {
            K= num;
        }
        System.out.println(K);
        System.out.println(getPermutation(n, K));
    }
}
