package newtonSchool.BasicDSA.DSA2.Strings;

import java.util.Scanner;

public class IntToRoman {
    public static String intToRoman(int n, String str) {
        if(n==0) {
            return str;
        }
        int k= n;
        String str1;
        int m=0;
        if(k>=1 && k<4) {
            m = 1;
        } else if(k== 4) {
            m = 4;
        } else if(k>=5 && k<9) {
            m = 5;
        } else if(k==9) {
            m = 9;
        } else if(k>=10 && k<40) {
            m=10;
        } else if(k>=40 && k<50) {
            m=40;
        } else if(k>=50 && k<90) {
            m=50;
        } else if(k>=90 && k<100) {
            m=90;
        } else if(k>=100 && k<400) {
            m=100;
        } else if(k>=400 && k<500) {
            m=400;
        } else if(k>=500 && k<900) {
            m=500;
        } else if(k>=900 && k<1000) {
            m = 900;
        } else {
            m=1000;
        }
        switch (m) {
            case 1:
                n-=1;
                str += 'I';
                return intToRoman(n, str);
            case 4:
                n -= 4;
                str += "IV";
                return intToRoman(n, str);
            case 5:
                n -= 5;
                str += "V";
                return intToRoman(n, str);
            case 9:
                n -= 9;
                str += "IX";
                return intToRoman(n, str);
            case 10:
                n -= 10;
                str += 'X';
                return intToRoman(n,str);
            case 40:
                n -= 40;
                str += "XL";
                return intToRoman(n,str);
            case 50:
                n -= 50;
                str += "L";
                return intToRoman(n,str);
            case 90:
                n -= 90;
                str += "XC";
                return intToRoman(n,str);
            case  100:
                n -= 100;
                str += "C";
                return intToRoman(n,str);
            case 400:
                n -= 400;
                str += "CD";
                return intToRoman(n,str);
            case 500:
                n -= 500;
                str += "D";
                return intToRoman(n,str);
            case 900:
                n -= 900;
                str += "CM";
                return intToRoman(n,str);
            case 1000:
                n -= 1000;
                str += "M";
                return intToRoman(n,str);
        }

        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String str = "";
        //System.out.println("Roman");
        System.out.println(intToRoman(n, str));
        //System.out.println("Integer");
        //System.out.println();

    }
}
