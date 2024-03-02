package newtonSchool.ADVDSA.DP;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumSum {
    public static BigInteger minSum(int[] num) {
        int rem= num.length%2;
        int n= num.length/2 + rem;
        String str1= "";
        String str2 = "";
        for(int i=0; i<num.length; i++){
            if(i%2 == 0){
                str1 += Integer.toString(num[i]);
            } else{
                str2 += Integer.toString(num[i]);
            }
        }
        BigInteger n1 = new BigInteger(str1);
        BigInteger n2= new BigInteger(str2);
        BigInteger ans = n1.add(n2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] num= new int[N];
        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println(minSum(num));
    }
}
