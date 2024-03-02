package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {
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

        System.out.println(Arrays.toString(dailyTemperatures(intArray)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];


        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.pop()] = i;
            }
            stack.push(i);
        }
        for(int i=0; i<result.length; i++){
            if(result[i] != 0){
                result[i] = result[i] - i;
            }

        }
        return result;
    }
}
//Input: temperatures = [73,74,75,71,69,72,76,73]

//stack = 73,76,72
//stack2= ,

//arr = [,,,,,1,0,0]


//Output: [1,1,4,2,1,1,0,0]


//8
//73 74 75 71 69 72 76 73