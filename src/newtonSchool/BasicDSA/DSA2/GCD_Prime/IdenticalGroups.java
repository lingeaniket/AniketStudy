package newtonSchool.BasicDSA.DSA2.GCD_Prime;

import java.util.Scanner;

public class IdenticalGroups {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a= sc.nextLong();
        long b= sc.nextLong();
        System.out.println(identicalGroups(a, b));
    }

    private static long identicalGroups(long a, long b) {
        if(b%a == 0) {
            return a;
        } else {
            int ans=0;
            for(int i=1; i<=a; i++) {
                if(a%i ==0 && b%i == 0) {
                    ans =i;
                }
            }
            return ans;
        }
    }
}
