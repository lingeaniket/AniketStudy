package newtonSchool.BasicDSA.DSA1;
import java.util.*;
public class MaximumArea {
    public static void printArray(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int maxArea(int[][] paperSize) {
        int row=0;
        for(int i=1; i<paperSize[0].length; i++) {
            int count=0;
            if(paperSize[0][i] == 1 && paperSize[0][i-1] == 2) {
                count++;
                int m=i;
                while(m<paperSize[0].length && paperSize[0][m] ==1) {
                    count++;
                    m++;
                }
                i=m;
                if(paperSize[0][m]== 2){
                    int k= count;
                    if(k >= row) {
                        row = k;
                    }
                }
            }
        }
        int col=0;
        for(int i=1; i<paperSize.length; i++) {
            int count=0;
            if(paperSize[i][0] == 1 && paperSize[i-1][0] == 2) {

                count++;
                int m=i;
                while(m<paperSize.length && paperSize[m][0] ==1) {
                    count++;
                    m++;
                }
                i=m;
                if(paperSize[m][0]== 2){
                    int k= count;
                    if(k >= col) {
                        col =k;
                    }
                }
            }
        }
        return col*row;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[][] paperSize = new int[N+1][M+1];
        for(int i=0; i<paperSize[0].length; i++) {
            paperSize[0][i] = 1;
        }
        for(int i=0; i<paperSize.length; i++) {
            if(paperSize[i][0] == 1){
                paperSize[i][0] = 2;
            } else {
                paperSize[i][0] = 1;
            }
        }
        for(int i=0; i<paperSize[0].length; i++) {
            if(paperSize[paperSize.length-1][i] == 1){
                paperSize[paperSize.length-1][i] = 2;
            } else {
                paperSize[paperSize.length-1][i] = 1;
            }
        }
        for(int i=0; i<paperSize.length; i++) {
            if(paperSize[i][paperSize[0].length -1] == 1){
                paperSize[i][paperSize[0].length-1] = 2;
            } else {
                paperSize[i][paperSize[0].length-1] = 1;
            }
        }
        int n= sc.nextInt();
        int m= sc.nextInt();
        for(int i=0; i<n; i++) {
            int k = sc.nextInt();
            for(int j=0; j<paperSize[0].length; j++) {
                if(paperSize[k][j] == 1) {
                    paperSize[k][j] = 2;
                } else {
                    paperSize[k][j] = 1;
                }
            }
        }
        for(int i=0; i<m; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < paperSize.length; j++) {
                if (paperSize[j][k] == 1) {
                    paperSize[j][k] = 2;
                } else {
                    paperSize[j][k] = 1;
                }
            }
        }
        //printArray(paperSize);
        System.out.println(maxArea(paperSize));
    }
}
