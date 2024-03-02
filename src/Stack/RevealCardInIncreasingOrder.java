package Stack;

import java.util.*;

public class RevealCardInIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String innerContent = input.substring(1, input.length() - 1);

        // Split the inner content using a comma as a delimiter
        String[] elements = innerContent.split(",");

        // Create an integer array to store the parsed elements
        int[] intArray = new int[elements.length];

        // Parse and store each element in the integer array
        for (int i = 0; i < elements.length; i++) {
            intArray[i] = Integer.parseInt(elements[i].trim());
        }

        System.out.println(Arrays.toString(deckRevealedIncreasing(intArray)));

    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); // [1,2,3,4,5,6]
        int n = deck.length; // n = 6
        int m = (deck.length+1)/2;  //m =3
        if(n%4 <2 && n%4 != 0){
            return queueAndQueue(deck);
        }
        return stackAndQueue(deck);
    }

    public static int[] stackAndQueue (int [] deck){
        Queue<Integer> qu = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        int n = deck.length; // n = 6
        int m = (deck.length+1)/2;  //m =3

        for(int i=m, j=n-1; i<=j; i++, j--){
            qu.add(deck[i]);
            stk.push(deck[j]);
        }
        int[] arr =new int[deck.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(i%2 == 1){
                if(i%4 == 1){
                    if(n%2 == 0){
                    arr[i]= qu.poll();
                    } else {
                    arr[i] = stk.pop();
                    }
                } else {
                    if(n%2 == 0){
                        arr[i] = stk.pop();
                    } else {
                        arr[i]= qu.poll();
                    }
                }
            } else {
                arr[i] = deck[j];
                j++;
            }
        }
        return arr;
    }
    public static int[] queueAndQueue (int [] deck){
        Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> stk = new LinkedList<>();
        int n = deck.length; // n = 6
        int m = (deck.length+1)/2;  //m =3

        for(int i=m, j=n-1; i<=j; i++, j--){
            qu.add(deck[i]);
            stk.add(deck[j]);
        }
        int[] arr =new int[deck.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(i%2 == 1){
                if(i%4 == 1){
                    if(n%2 == 0){
                        arr[i]= qu.poll();
                    } else {
                        arr[i] = stk.poll();
                    }
                } else {
                    if(n%2 == 0){
                        arr[i] = stk.poll();
                    } else {
                        arr[i]= qu.poll();
                    }
                }
            } else {
                arr[i] = deck[j];
                j++;
            }
        }
        return arr;
    }
}
