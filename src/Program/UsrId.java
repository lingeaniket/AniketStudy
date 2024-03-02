import java.io.*;
import  java.util.*;

// Read only region start
class UsrID {
    public static String userId(String input1,String input2,int input3,int input4)
    {
        // Read only region end
        String fName = input1;
        String lName = input2;
        int pin = input3;
        int N = input4;

        String longName;
        String smallName;
        StringBuilder userId = new StringBuilder();

        if (fName.length() < lName.length())
        {
            longName = fName;
            smallName = lName;
        } else if (fName.length() > lName.length())
        {
            longName = lName;
            smallName = fName;
        } else
        {
            if (fName.compareTo(lName) < 1 )
            {
                longName = lName;
                smallName = fName;
            } else
            {
                longName = fName;
                smallName = lName;
            }
        }

        userId.append(smallName.charAt(smallName.length() - 1));
        userId.append(longName);

        for (int i = 0; i < userId.length(); i++)
        {
            if (Character.isUpperCase(userId.charAt(i)))
                userId.setCharAt(i, Character.toLowerCase(userId.charAt(i)));
            else
                userId.setCharAt(i, Character.toUpperCase(userId.charAt(i)));
        }

        userId.append(String.valueOf(pin).charAt(N - 1));
        userId.append(String.valueOf(pin).charAt(String.valueOf(pin).length() - N));

        return userId.toString();
    }


    public static void main(String[] args)
    {
        System.out.println("user id generated is =  "+userId("Rajiv","Roy",560037,6));
    }
}

