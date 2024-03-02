package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;
import java.util.Stack;

public class PossibleWordsFromPhoneDigits {
    static char[] n2 ={'a','b','c'};
    static char[] n3 ={'d','e','f'};
    static char[] n4 ={'g','h','i'};
    static char[] n5 ={'j','k','l'};
    static char[] n6 ={'m','n','o'};
    static char[] n7 ={'p','q','r','s'};
    static char[] n8 ={'t','u','v'};
    static char[] n9 ={'w','x','y','z'};

    static void PrintStack(Stack<Character> s)
    {
        if (s.isEmpty())
            return;
        char x = s.peek();
        s.pop();
        PrintStack(s);
        System.out.print(x);
        s.push(x);
    }
    public static void dialPadPrint(int[] arr, int N, int idx, int Nidx, Stack<Character> st) {
        if(N==0 || Nidx==arr.length) {
            PrintStack(st);
            System.out.print(" ");
            return;
        } else {
            if(arr[idx]==2) {
                for(int i=0; i<n2.length; i++) {
                    st.push(n2[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            } else if(arr[idx]==3) {
                for(int i=0; i<n3.length; i++) {
                    st.push(n3[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            } else if(arr[idx]==4) {
                for(int i=0; i<n4.length; i++) {
                    st.push(n4[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            } else if(arr[idx]==5) {
                for(int i=0; i<n5.length; i++) {
                    st.push(n5[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            } else if(arr[idx]==6) {
                for(int i=0; i<n6.length; i++) {
                    st.push(n6[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            } else if(arr[idx]==7) {
                for(int i=0; i<n7.length; i++) {
                    st.push(n7[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            } else if(arr[idx]==8) {
                for(int i=0; i<n8.length; i++) {
                    st.push(n8[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            } else if(arr[idx]==9) {
                for(int i=0; i<n9.length; i++) {
                    st.push(n9[i]);
                    dialPadPrint(arr, --N, ++idx, ++Nidx, st);
                    N++;
                    idx--;
                    Nidx--;
                    st.pop();
                }
            }

        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int N= sc.nextInt();
            int[] dial = new int[N];
            for(int i=0; i<N; i++) {
                dial[i] = sc.nextInt();
            }
            Stack<Character> st = new Stack<>();
            dialPadPrint(dial, N, 0, 0, st);
        }
    }
}
