package newtonSchool.ADVDSA.DP;

import java.util.Scanner;

public class DragonSlayer {
    public static int DragonSlayer1(int A, int B, int C, int D) {
        int Dragon = A-D;
        int Natsu = C;
        while(Dragon > 0 && Natsu >0) {
            Natsu = Natsu - B;
            if(Natsu <=0) {
                return 0;
            }
            Dragon = Dragon - D;
        }
        if(Dragon >= Natsu) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.println(DragonSlayer1(A, B,C,D));
    }
}
