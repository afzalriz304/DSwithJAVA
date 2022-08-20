package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //String[] s = {"flower", "flow", "flight"};
        String[] s = {"ab", "a"};
        System.out.println(prefix(s));
    }

    private static String prefix(String[] s) {
        if (s == null)
            return "";
        if (s.length == 1)
            return s[0];
        String prefix = s[0];
        for (int i = 0; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
