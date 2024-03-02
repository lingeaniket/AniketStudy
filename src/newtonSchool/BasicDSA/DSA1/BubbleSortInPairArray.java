package newtonSchool.BasicDSA.DSA1;

import java.util.Scanner;

class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class BubbleSortInPairArray {
    static Pair[] SortPair(Pair arr[], int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].x > arr[j - 1].x) {
                    swap(arr, j, j - 1);
                } else if(arr[j].x == arr[j-1].x) {
                    if(arr[j].y > arr[j-1].y) {
                        swap(arr, j, j-1);
                    }
                }
            }
        }
        return arr;
    }
    public static void swap(Pair[] arr, int i, int j) {
        Pair temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        Pair[] arr = new Pair[N];
        for(int i=0; i<N; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            Pair p1= new Pair(a,b);
            arr[i] = p1;
        }
        SortPair(arr, N);
        for(int i=0; i<N; i++) {
            System.out.print(arr[i].x+ " "+ arr[i].y);
            System.out.print(" ");
        }
    }
}
