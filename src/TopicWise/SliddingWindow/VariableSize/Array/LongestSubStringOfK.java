package TopicWise.SliddingWindow.VariableSize.Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringOfK {
    public static void main(String[] args) {
        String str = "abbbbbbc";
        int k = 3;
        System.out.println(longestSubStringOfSizeK("abbbbbbc", 2));
        System.out.println(longestSubStringOfSizeK("abcddefg", 3));
        System.out.println(longestSubStringOfSizeK("aaaaaaaa", 3));
        System.out.println(longestSubStringOfSizeK("abcefg", 1));
    }

    private static int longestSubStringOfSizeK(String str, int k) {
        int max = 0;
        if (str.isEmpty() || str.isBlank())
            return max;
        char[] c = str.toCharArray();
        int i = 0;
        int j = 0;
        Map<Character, Integer> count = new HashMap<>();
        while (j < str.length()) {
            count.put(c[j], count.getOrDefault(c[j], 0) + 1);
            if (count.size() < k) {
                j++;
            } else if (count.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (count.size() > k) {
                    if (count.getOrDefault(c[i], 0) >1) {
                        count.put(c[i], count.get(c[i]) - 1);
                    } else {
                        count.remove(c[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        max = Math.max(max, j - i);

        return max;
    }
}
