package Program;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int primeSum(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            int digit= arr[i]/10;
            sum+= digit%10;
        }
        return sum;
    }
    static boolean isPrime(int N) {
        if(N==1)
            return false;
        for(int i=2; i<=N; i++){
            if(N%i==0)
                return false;
        }
        return true;
    }
    static int[] primeNumbers(int[] arr) {
        int n=0;
        int[] prime = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(isPrime(arr[i])){
                prime[n] = arr[i];
                n++;
            }
        }
        return prime;
    }
    static int[] arrayForm(int F, int L) {
        int[] arr = new int[L-F];
        for(int i=0; i<(L-F); i++) {
            arr[i] = F;
            F++;
        }
        return arr;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
            int F= 2;
            int L= 15;
            System.out.println(primeSum(primeNumbers(arrayForm(F, L))));

    }
}
