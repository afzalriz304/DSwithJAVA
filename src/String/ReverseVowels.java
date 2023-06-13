package String;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet();
        vowels.addAll(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        int i=0;
        int j=s.length()-1;
        char[] chars = s.toCharArray();
        while(i<j){
            if(vowels.contains(chars[i]) && vowels.contains(chars[j])){
                char temp = chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            }else if(vowels.contains(chars[i])){
                j--;
            }else{
                i++;
            }
        }
        return String.valueOf(chars);
    }
}
