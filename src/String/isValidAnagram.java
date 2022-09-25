package String;

public class isValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0)
                return false;
        }
        return true;
    }
}
