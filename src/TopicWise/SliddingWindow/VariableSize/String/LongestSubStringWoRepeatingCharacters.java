package TopicWise.SliddingWindow.VariableSize.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWoRepeatingCharacters {
    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(LongestSubstring("aabaab!bb"));
    }

    private static int LongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;
        if (s.length() == 1)
            return 1;
        if (s.isBlank())
            return 1;
        int max = 0;
        int i = 0;
        int j = 0;
        Map<Character, Integer> count = new HashMap<>();
        while (j < s.length()) {
            count.put(s.charAt(j), count.getOrDefault(s.charAt(j), 0) + 1);
            while (count.get(s.charAt(j)) != 1) {
                count.put(s.charAt(i), count.get(s.charAt(i)) - 1);
                i++;
            }
            max = Math.max(j - i + 1, max);
            j++;
        }
        return max;
    }

    private static int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s.isEmpty()) {
            return max;
        }
        int i = 0;
        int j = 0;
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet();
        while (j < s.length()) {
            if (set.contains(c[j])) {
                set.remove(c[i]);
                i++;
            } else {
                set.add(c[j]);
                j++;
            }
            max = Math.max(set.size(), max);
        }
        return max;
    }
}
