package Program;

import java.util.Scanner;

public class First {
    public static boolean isPrime(int N) {
        if(N<1) {
            return false;
        }
        for(int i=2; i<= (int) Math.sqrt(N); i++) {
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int find_tValue(int input1, int input2, int input3) {
        int t=1;
        if(input2 == 2) {
            t= input1*input1*(2+3);
        } else if(isPrime(input2)) {
            int count=1;
            int k=3;
            int sum=2;
            while(count<input3) {
                if(isPrime(k)) {
                    count++;
                    sum += k;
                }
                k++;
            }
            t = input2*input2*(sum);

        } else if(isPrime(input2) == false && input2%2 ==0) {
            int count=1;
            int k=3;
            int sum=2;
            while(count<input3+input2) {
                if(isPrime(k)) {
                    count++;
                    sum += k;
                }
                k++;
            }
            t = input2*input2*(sum);
        } else if(isPrime(input2) == false && input2%2 !=0) {
            int count=1;
            int k=3;
            int sum=2;
            while(count<input3+input2+input1) {
                if(isPrime(k)) {
                    count++;
                    sum += k;;
                }
                k++;
            }
            t = input2*input2*(sum);
        }

        if(isPrime(t)) {
            return t+input3;
        } else{
            return t-input3;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(find_tValue(a, b, c));
    }
}
