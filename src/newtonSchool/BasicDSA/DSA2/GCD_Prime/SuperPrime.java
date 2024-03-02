package newtonSchool.BasicDSA.DSA2.GCD_Prime;

import java.util.Scanner;

public class SuperPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        superPrime(N);
    }

    private static void superPrime(int n) {
        for(int i=1; i<=n; i++){
            int count=0;
            for(int j=1; j<=n; j++){
                int ij = i*j;
                if(ij > i && ij <=n) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                System.out.print(i +" ");
            }
        }
    }
}
