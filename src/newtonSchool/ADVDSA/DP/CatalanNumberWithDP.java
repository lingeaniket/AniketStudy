package newtonSchool.ADVDSA.DP;

import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNumberWithDP {
    public static BigInteger fact(BigInteger n, BigInteger[] dp){
        //long m= 1000000007;
        BigInteger f=  new BigInteger("1");
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger nByTwo = n.divide(two);
        BigInteger nByTwoPlusOne = nByTwo.add(one);
        for(BigInteger i= new BigInteger("1"); (i.compareTo(n)== -1 || i.compareTo(n) == 0); i=i.add(one)) {
            f= (f.multiply(i));
            BigInteger mod1 = new BigInteger("1000000007");
            if(f.compareTo(mod1) == 1) {
                f = f.mod(mod1);
            }
            if(i.compareTo(nByTwo)==0){
                dp[0] = f;
            }
            if(i.compareTo(nByTwoPlusOne)==0){
                dp[1] = f;
            }
        }
        return f;
    }
    public static BigInteger catalan(BigInteger n, BigInteger[] dp) {
        //long k= 1000000007L;
        BigInteger two = new BigInteger("2");
        BigInteger a= fact((two.multiply(n)), dp);
        BigInteger b= dp[0];
        BigInteger c= dp[1];
        BigInteger d = (b.multiply(c));
        BigInteger m= a.divide(d);
        BigInteger mod1 = new BigInteger("1000000007");
        if(m.compareTo(mod1) == 1) {
            m = m.mod(mod1);
        }
        return m;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int N= sc.nextInt();
            String str = Integer.toString(N);
            BigInteger num = new BigInteger(str);
            BigInteger[] dp = new BigInteger[2];
            System.out.println(catalan(num, dp));
        }
    }
}
