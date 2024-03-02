package Program;

import java.util.Scanner;

public class NCR {
    public static int nCr(int n, int r) {
        return (fact(n)/(fact(r)*fact(n-r)));
    }
    public static int fact(int n) {
        if(n==0) {
            return 1;
        }
        int ans = 1;
        for(int i=2; i<=n;i++) {
            ans = ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        System.out.println(nCr(n,r));
    }
}
