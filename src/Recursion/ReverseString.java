package Recursion;

public class ReverseString {

    private static String reverse(String str) {
        if (str.isEmpty()) {
            return "";
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    private static char[] reverse(char[] s, int i, int j) {
        if (s == null)
            return null;
        if (s.length == 1)
            return s;
        if (i == j || i>j)
            return s;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return reverse(s, i+1, j-1);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverse(s, 0, s.length - 1));
    }
}
