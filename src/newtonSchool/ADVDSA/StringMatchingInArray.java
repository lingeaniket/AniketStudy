package newtonSchool.ADVDSA;

import java.util.*;


public class StringMatchingInArray {
    public static List<String> stringMatching(String[] words) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[j].equals(words[i])==false && words[j].contains(words[i]))
                {
                    l.add(words[i]);
                    break;
                }
            }
        }
        l.sort(Comparator.naturalOrder());
        return l;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        String[] str = new String[N];
        for(int i=0; i<N; i++) {
            str[i] = sc.next();
        }
        for(String ans:stringMatching(str)){
            System.out.print(ans +" ");
        }
        //System.out.println(stringMatching(str));
    }
}
