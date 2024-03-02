package newtonSchool.ADVDSA.Greedy;

import java.math.BigInteger;
import java.util.Scanner;

public class GoodNumbers2 {
    public static BigInteger goodNumber(long N, BigInteger[] arr){
        int id=0;
        String str = Long.toString(N);
        BigInteger num = new BigInteger(str);
        for(int i=1; i<arr.length; i++) {
            //int a= num.compareTo(arr[i]);
            //int b= num.compareTo(arr[i-1]);
            //int c= num.compareTo(arr[i-1]);
            if(num.compareTo(arr[i]) == -1 && (num.compareTo(arr[i-1]) == 1 || num.compareTo(arr[i-1]) == 0)) {
                id= i-1;
                break;
            }
        }
        String st = Integer.toString(id);
        BigInteger idx1 = new BigInteger(st);
        BigInteger m= num.divide(arr[id]);
        BigInteger nine = new BigInteger("9");
        BigInteger one = new BigInteger("1");
        BigInteger ans = (nine.multiply(idx1.subtract(one))).add(m);
        //long ans= (9L*(id-1L) + m);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N= sc.nextLong();

        BigInteger[] arr = new BigInteger[22];
        //long[] arr = new long[21];
        BigInteger m= new BigInteger("0");
        BigInteger k= new BigInteger("10");
        BigInteger one = new BigInteger("1");
        int count=0;
        while(count<21) {
            arr[count] = m;
            m= m.multiply(k).add(one);
            count++;
        }
        System.out.println(goodNumber(N, arr));
    }
}
