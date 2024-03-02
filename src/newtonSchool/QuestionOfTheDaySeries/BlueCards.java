package newtonSchool.QuestionOfTheDaySeries;
/*
Problem Statement
Alice wants to play game of cards.
Alice has two types of cards, red and blue.
Initially, there is no card placed.
Alice placed cards in order:
Firstly place A blue cards, then, place B red cards, repeatedly.
How many blue cards will be there among the first N cards in the row of cards made this way?
Input
The first line contains three integers, N, A, and B.

Constraints:
1 <= N <= 1018
A, B >= 0
0 < A+B <= 1018
Output
Print the number of blue cards that will be there among the first N cards in the row of cards.
Example
Sample Input 1
8 3 4
Sample Output 1
4
Let b denote a blue card, and r denote a red card. The first eight cards in the row will be bbbrrrrb, among which there are four blue cards.

Sample Input 2
8 0 4
Sample Output 2
0
He placed only red cards from the beginning.

Sample Input 3
6 2 4
Sample Output 3
2
Among bbrrrr, there are two blue cards.
 */
import java.util.Scanner;

public class BlueCards {
    public static long blueCard(long N, long B, long R){
        long T= B+R;
        if(N<=T){
            if(N<B){
                return N;
            } else {
                return B;
            }
        }
        long rem = N%T;
        long tot = N/T;
        long ans = tot*B;
        if(rem >0 && rem <=B){
            ans += rem;
        } else if(rem >B){
            ans+= B;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N= sc.nextLong();
        long B= sc.nextLong();
        long R= sc.nextLong();
        System.out.println(blueCard(N,B,R));
    }
}