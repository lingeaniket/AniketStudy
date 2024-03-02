package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequentialDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt(), high = sc.nextInt();
        System.out.println(sequentialDigits(low,high));
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        //find the digits
        int number = low;
        int digits=0;
        while(number>0){
            digits++;
            number =number/ 10;
        }

        // create first number;
        int firstNum = 0;
        int fact =1;
        int inc = 0;
        int dig = digits--;
        while(dig>0){
            firstNum += dig*fact;
            inc += fact;
            fact *=10;
            dig--;
        }
        digits++;
        int firstNumOrg = firstNum;
        int incOrg = inc;

        while(firstNum <=high){
            if(firstNum%10 !=0){
                if(firstNum >= low){
                    list.add(firstNum);
                }
                firstNum += inc;
            } else {
                digits++;
                firstNum = firstNumOrg*10 + digits;
                inc = incOrg*10 +1;
                incOrg = inc;
                firstNumOrg = firstNum;
            }
        }
        return list;
    }
}

