package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {

    }
    public static boolean isAvail (String str, char x){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == x){
                return true;
            }
        }
        return false;
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<words.length; i++) {
            if(isAvail(words[i], x)){
                list.add(i);
            }
        }

        return list;
    }
}
