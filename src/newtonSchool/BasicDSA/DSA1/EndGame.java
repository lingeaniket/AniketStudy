package newtonSchool.BasicDSA.DSA1;

import java.util.Arrays;
import java.util.Scanner;

public class EndGame {
        public static int printLargest(int[] arr2) {
            Arrays.sort(arr2);
            int n= arr2.length;
            return arr2[n-1];
        }
        public static void printArrayList(int[] arr, int K) {
            int ptr1=0;
            int ptr2=K-1;
            int[] arr2 = new int[K];
            while(ptr2< arr.length) {
                int m=0;
                for(int i=ptr1; i<=ptr2; i++) {
                    arr2[m] = arr[i];
                    m++;
                }
                System.out.print(printLargest(arr2) + " ");
                ptr1++;
                ptr2++;
            }
        }
        public static void main (String[] args) {
            Scanner sc= new Scanner(System.in);
            int N = sc.nextInt();
            int[] arr= new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            int K=sc.nextInt();
            printArrayList(arr, K);
        }
    }
