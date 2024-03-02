package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;

public class saraPhone {
    static int count=0;
    static int Phone(int N, int K, int M){
        if(N*K < M) {
            return -1;
        } else if (M<=0 || N<=0){
            return count;
        } else {
            M = M-K;
            count++;
            return Phone(--N, K, M);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int K= sc.nextInt();
        int M= sc.nextInt();
        System.out.println(Phone(N,K,M));
    }
}
