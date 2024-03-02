package newtonSchool.QuestionOfTheDaySeries;

import java.util.Scanner;

/*
Problem Statement
Bob has an array of N numbers. He wants to calculate the product of array, but does not want integers greater than 1018. So, if the result exceeds 1018, print -1 instead.
Input
Constraints:
2 <= N <= 10^5
0 <= Ai <= 10^18
All values in input are integers.
Output
Print the value of A1×A2....×AN as an integer, or -1 if the value exceeds 10^18.
Example
Sample Input 1
2
1000000000 1000000000

Sample Output 1
1000000000000000000
We have 1000000000×1000000000=1000000000000000000.

Sample Input 2
3
101 9901 999999000001
Sample Output 2
-1
We have 101×9901×999999000001=1000000000000000001, which exceeds 10^18, so we should print -1 instead.

Sample Input 3
31
4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6 2 6 4 3 3 8 3 2 7 9 5 0
Sample Output 3
0
 */
public class ArrayProduct {
    public static long arrayProduct(long[] num, int idx, long ans){
        if(ans > 1000000000000000000L){
            return 1;
        }
        if(idx == num.length){
            return ans;
        }
        ans *= num[idx];
        return arrayProduct(num, idx+1, ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        long[] num = new long[N];
        for(int i=0; i<N;i++){
            num[i] = sc.nextLong();
        }
        System.out.println(arrayProduct(num, 0, 1));
    }

}
