package LeetCodeProblems.String;

import java.util.*;

/*
You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:

event1 = [startTime1, endTime1] and
event2 = [startTime2, endTime2].
Event times are valid 24 hours format in the form of HH:MM.

A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).

Return true if there is a conflict between two events. Otherwise, return false.

Example 1:

Input: event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]
Output: true
Explanation: The two events intersect at time 2:00.
Example 2:

Input: event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]
Output: true
Explanation: The two events intersect starting from 01:20 to 02:00.
Example 3:

Input: event1 = ["10:00","11:00"], event2 = ["14:00","15:00"]
Output: false
Explanation: The two events do not intersect.

Constraints:

event1.length == event2.length == 2.
event1[i].length == event2[i].length == 5
startTime1 <= endTime1
startTime2 <= endTime2
All the event times follow the HH:MM format.
 */
public class DetermineIfTwoEventsHaveConflict {

    public static boolean haveConflict(String[] event1, String[] event2) {
        String Starthr1="";
        String Startmin1="";
        String Starthr2="";
        String Startmin2="";
        String Endhr1="";
        String Endmin1="";
        String Endhr2="";
        String Endmin2="";
        for(int i=0; i<5; i++) {
            if(i<2) {
                Starthr1 += event1[0].charAt(i);
                Endhr1 += event1[1].charAt(i);
                Starthr2 += event2[0].charAt(i);
                Endhr2 += event2[1].charAt(i);
            } else if(i >=3) {
                Startmin1 += event1[0].charAt(i);
                Endmin1 += event1[1].charAt(i);
                Startmin2 += event2[0].charAt(i);
                Endmin2 += event2[1].charAt(i);
            }
        }
        int Start1Hr = Integer.parseInt(Starthr1);
        int End1Hr = Integer.parseInt(Endhr1);
        int Start2Hr = Integer.parseInt(Starthr2);
        int End2Hr = Integer.parseInt(Endhr2);

        int Start1Min = Integer.parseInt(Startmin1);
        int End1Min = Integer.parseInt(Endmin1);
        int Start2Min = Integer.parseInt(Startmin2);
        int End2Min = Integer.parseInt(Endmin2);

        int StartEvent1 = (60*Start1Hr) + Start1Min;
        int EndEvent1 = (60*End1Hr) + End1Min;
        int StartEvent2 = (60*Start2Hr) + Start2Min;
        int EndEvent2 = (60*End2Hr) + End2Min;
        if(StartEvent1 < StartEvent2) {
            if(EndEvent1 >= StartEvent2) {
                return true;
            }
        } else if(StartEvent1 > StartEvent2) {
            if(EndEvent2 >= StartEvent1) {
                return true;
            }
        }
        if(StartEvent1 == StartEvent2 || EndEvent1 == EndEvent2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] event1 ={"14:13","22:08"};
        String[] event2 ={"02:40","08:08"};
        System.out.println(haveConflict(event1, event2));
    }
}
/*
["01:37","14:20"]
["05:06","06:17"]
 */