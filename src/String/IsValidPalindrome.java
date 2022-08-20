package String;

public class IsValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValidPalindrome("race a car"));
        System.out.println(isValidPalindromeOptimalSolution("race a car"));
    }

    private static boolean isValidPalindrome(String s) {
        if (s.isEmpty() || s.isBlank())
            return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if ((Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                    && (Character.isAlphabetic(s.charAt(j)) || Character.isDigit(s.charAt(j)))) {
                if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j))
                    return false;
                i++;
                j--;
            } else if (!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i)))
                i++;
            else
                j--;
        }
        return true;
    }

    private static boolean isValidPalindromeOptimalSolution(String s) {
        if (s.isEmpty() || s.isBlank())
            return true;
        StringBuilder alphaNumericString = new StringBuilder();
        char[] c = s.toLowerCase().toCharArray();
        for (char i : c) {
            if (Character.isAlphabetic(i) || Character.isDigit(i))
                alphaNumericString.append(i);
        }
        int i = 0;
        int j = alphaNumericString.length() - 1;
        while (i < j) {
            if (alphaNumericString.charAt(i) != alphaNumericString.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
