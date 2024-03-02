package Program;

import java.util.Scanner;

public class keyNumber {
    public static int findKey(int input1, int input2, int input3) {
        // Storing element at 1th places
        int[] num1= new int[3];
        int i=0;
        num1[i++] = input1%10;
        input1 = input1/10;
        num1[i++] = input2%10;
        input2 = input2/10;
        num1[i++] = input3%10;
        input3 = input3/10;
        int SNum1 = num1[0];
        int LNum1 = 0;
        for(int m=0; m<3; m++) {
            if(num1[m] <= SNum1){
                SNum1 = num1[m];
            }

            if(num1[m] >= LNum1) {
                LNum1 = num1[m];
            }
        }

        // Storing element at 10th places
        int[] num10= new int[3];
        i=0;
        num10[i++] = input1%10;
        input1 = input1/10;
        num10[i++] = input2%10;
        input2 = input2/10;
        num10[i++] = input3%10;
        input3 = input3/10;
        int SNum10 = num10[0];
        int LNum10 = 0;
        for(int m=0; m<3; m++) {
            if(num10[m] <= SNum10){
                SNum10 = num10[m];
            }

            if(num10[m] >= LNum10) {
                LNum10 = num10[m];
            }
        }

        // Storing element at 100th places
        int[] num100= new int[3];
        i=0;
        num100[i++] = input1%10;
        input1 = input1/10;
        num100[i++] = input2%10;
        input2 = input2/10;
        num100[i++] = input3%10;
        input3= input3/10;
        int SNum100 = num100[0];
        int LNum100 = 0;
        for(int m=0; m<3; m++) {
            if(num100[m] <= SNum100){
                SNum100 = num100[m];
            }

            if(num100[m] >= LNum100) {
                LNum100 = num100[m];
            }
        }

        // Storing element at 1000th places
        int[] num1000= new int[3];
        i=0;
        num1000[i++] = input1%10;
        num1000[i++] = input2%10;
        num1000[i++] = input3%10;
        int SNum1000 = num1000[0];
        int LNum1000 = 0;
        for(int m=0; m<3; m++) {
            if(num1000[m] <= SNum1000){
                SNum1000 = num1000[m];
            }

            if(num1000[m] >= LNum1000) {
                LNum1000 = num1000[m];
            }
        }

        int ans =0;
        ans += (LNum1 - SNum1);
        ans += (10*(LNum10-SNum10));
        ans += (100*(LNum100-SNum100));
        ans += (1000*(LNum1000- SNum1000));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=  sc.nextInt();
        System.out.println(findKey(a, b, c));
    }
}
