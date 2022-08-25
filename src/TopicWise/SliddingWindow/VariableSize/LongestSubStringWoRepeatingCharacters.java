package TopicWise.SliddingWindow.VariableSize;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWoRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    private static int lengthOfLongestSubstring(String s) {
        int max = 0;
        if(s.isEmpty()){
            return max;
        }
        int i=0;
        int j=0;
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet();
        while(j<s.length()){
            if(set.contains(c[j])){
                set.remove(c[i]);
                i++;
            }else{
                set.add(c[j]);
                j++;
            }
            max = Math.max(set.size(),max);
        }
        return max;
    }
}
