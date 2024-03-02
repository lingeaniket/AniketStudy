package newtonSchool.BasicDSA.DSA2.Strings;

import java.util.Scanner;

public class RomanToInt {
    public static int romanToInt(String s) {
        int num=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'I') {
                if(i+1 <s.length()) {
                    if(s.charAt(i+1) == 'V') {
                        num += 4;
                        i++;
                    } else if(s.charAt(i+1) == 'X') {
                        num += 9;
                        i++;
                    } else {
                        num +=1;
                    }
                } else {
                    num += 1;
                }
            } else if(s.charAt(i) == 'V') {
                num += 5;
            } else if(s.charAt(i) == 'X') {
                if(i+1 <s.length()) {
                    if(s.charAt(i+1) == 'L') {
                        num += 40;
                        i++;
                    } else if(s.charAt(i+1) == 'C') {
                        num += 90;
                        i++;
                    } else {
                        num +=10;
                    }
                } else {
                    num += 10;
                }
            } else if(s.charAt(i) == 'L') {
                num += 50;
            } else if(s.charAt(i) == 'C') {
                if(i+1 <s.length()) {
                    if(s.charAt(i+1) == 'D') {
                        num += 400;
                        i++;
                    } else if(s.charAt(i+1) == 'M') {
                        num += 900;
                        i++;
                    } else {
                        num +=100;
                    }
                } else {
                    num += 100;
                }
            } else if(s.charAt(i) =='D') {
                num += 500;
            } else if(s.charAt(i) == 'M') {
                num += 1000;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        System.out.println(romanToInt(str));
    }
}
