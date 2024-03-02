package InfosysSpringboard;

import java.util.Scanner;

public class Calculator {
    int num;

    public int sumOfDigits(int num) {
        this.num = num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}

class Tester {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.num = sc.nextInt();
        System.out.println(calculator.sumOfDigits(calculator.num));
    }
}
