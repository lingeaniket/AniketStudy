package newtonSchool.ADVDSA.DP;

import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNumberWithBigInteger {
    public static BigInteger fact(int n) {
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
    /*
    public static BigInteger fac(int n){

        return fact(2*n);
    }
    */
    public static BigInteger catalan(int n) {
        return  fact(2 * n).divide(fact(n + 1).multiply(fact(n)));
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int N= sc.nextInt();
            System.out.println(catalan(N));
        }
    }
}
