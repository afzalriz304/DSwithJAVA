package TopicWise.SliddingWindow;

import java.util.*;

public class CountAnagram {
    public static void main(String[] args) {
        String str = "cbaebabacd";
        String sub = "abc";
//        String str = "abab";
//        String sub = "ab";
        System.out.println(countAnagram(str, sub));
        System.out.println(countAnagramOptimal(str, sub));
    }

    private static List<Integer> countAnagramOptimal(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (p.isBlank() || p.isEmpty())
            return list;

        Map<Character, Integer> pMap = new HashMap<>();
        for (Character c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }
        int i = 0;
        int j = 0;
        int k = p.length();
        Map<Character, Integer> currenMap = new HashMap<>();
        while (j < s.length()) {
            currenMap.put(s.charAt(j), currenMap.getOrDefault(s.charAt(j), 0) + 1);
            if (j - i + 1 < k) {
                j++;
            } else {
                if (anagram(pMap, currenMap)) {
                    list.add(i);
                }
                char old = s.charAt(i);
                if (currenMap.getOrDefault(old, 0) != 0) {
                    currenMap.put(old, currenMap.get(old) - 1);
                } else {
                    currenMap.remove(old);
                }
                i++;
                j++;
            }
        }
        return list;
    }

    private static boolean anagram(Map<Character, Integer> pMap, Map<Character, Integer> cMap) {
        for (char c : cMap.keySet()) {
            if (!pMap.getOrDefault(c, 0).equals(cMap.get(c)))
                return false;
        }
        return true;
    }


    private static List<Integer> countAnagram(String str, String sub) {
        List<Integer> list = new ArrayList<>();
        if (sub.isBlank() || sub.isEmpty())
            return list;
        int i = 0;
        int j = 0;
        int len = str.length();
        char[] parent = str.toCharArray();
        char[] child = sub.toCharArray();
        Arrays.sort(child);
        String current = "";
        while (j < len) {
            current += parent[j];
            if (j - i + 1 < sub.length()) {
                j++;
            } else {
                char[] cur = current.toCharArray();
                Arrays.sort(cur);
                if (Arrays.equals(cur, child)) {
                    list.add(i);
                }
                current = current.substring(1);
                i++;
                j++;
            }
        }
        return list;
    }
}
