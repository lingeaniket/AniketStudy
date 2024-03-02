package Program;

import java.util.Scanner;

public class maxNumb {
    public static int maxjj(int a, int b, int c, int d) {
        int m=0;
        m += (d);
        m += (10*(c));
        m +=  (100*(b));
        m += (1000*(a));
        return m;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int maxA= sc.nextInt();
        int maxB = sc.nextInt();
        int maxC= sc.nextInt();
        int maxD= sc.nextInt();


        System.out.println(maxjj(maxA, maxB, maxC, maxD));
    }
}
