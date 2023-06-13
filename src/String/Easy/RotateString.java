package String.Easy;

import java.util.Arrays;

public class RotateString {
    public static void main(String[] args) {

        String s = "abcde";
        //String goal = "bcdea";
        String goal = "cdeab";
        System.out.println(isGoalPossible(s, goal));
    }

    private static boolean isGoalPossible(String s, String goal) {
        if(s==null || goal==null)
            return false;
        if(s==goal)
            return true;
        int allowed = s.length();
        int shift = 0;
        while (shift<allowed){
            s = s.substring(1,s.length())+s.charAt(0);
            if(s.equals(goal))
                return true;
            shift++;
        }
        return false;
    }
}
