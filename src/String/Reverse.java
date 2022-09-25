package String;

public class Reverse {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseStr(s));
    }

    private static char[] reverseStr(char[] s) {
        if (s == null || s.length == 1)
            return s;
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }
}
