package LeetCodeProblems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long value= sc.nextLong();
        long m= sc.nextLong();
        long cal= value/m;
        System.out.println("Division:- " + cal);
        System.out.println("Remaining:- " +value%m);
        System.out.println("Original:- " + cal*9);
    }
}
