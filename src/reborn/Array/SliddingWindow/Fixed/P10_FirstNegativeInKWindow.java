package reborn.Array.SliddingWindow.Fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class P10_FirstNegativeInKWindow {

    public static void main(String[] args) {
        int[] nums0 = new int[]{5, -3, 2, 3, -4};
        int[] nums1 = new int[]{3, 6, 3, 2, 5, -3};
        //System.out.println(Arrays.toString(firstNegativeInKWindow(nums0, 2)));
        //System.out.println(Arrays.toString(firstNegativeInKWindow(nums1, 5)));


        System.out.println(reverseString("Welcome to coding ninja"));
    }

    public static String reverseString(String str)
    {
        //Write your code here
        String[] words = str.split(" ");

        int i=0;
        int j=words.length-1;

        while(i<j){
            String temp = words[i];
            words[j]=words[i];
            words[i]=temp;
            i++;
            j--;
        }

        StringJoiner joiner = new StringJoiner(" ");
        for(String s : words){
            joiner.add(s);
        }
        return joiner.toString();
    }

    private static int[] firstNegativeInKWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (j - i + 1 < k) {
                j++;
            } else {
                int pointer = i;
                boolean isFound = false;
                while (pointer <= j) {
                    if (nums[pointer] < 0 && !isFound) {
                        list.add(nums[pointer]);
                        isFound = true;
                    }
                    pointer++;
                }
                if (!isFound) {
                    list.add(0);
                }
                i++;
            }
        }

        int[] result = new int[list.size()];
        int index = 0;
        for (Integer val : list) {
            result[index] = val;
            index++;
        }
        return result;
    }
}
