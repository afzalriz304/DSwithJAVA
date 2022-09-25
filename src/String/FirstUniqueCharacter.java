package String;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(uniqueCharacter(s));
    }

    private static int uniqueCharacter(String s) {
        if (s == null)
            return -1;
        if (s.length() == 1)
            return 0;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[(int) s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
