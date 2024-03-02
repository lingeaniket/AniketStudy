package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;

public class catalanNum {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static int catalanNum(int N) {
        int num=0;
        int n1= factorial(2*N);
        int n2= factorial(N+1);
        int n3= factorial(N);
        num = n1 /(n2*n3);
        return num;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int N= sc.nextInt();
            System.out.println(catalanNum(N));
        }
    }
}
