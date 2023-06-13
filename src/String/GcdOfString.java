package String;

public class GcdOfString {
    public static void main(String[] args) {
        //String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str1 = "ABABAB";
        String str2 = "ABAB";
        //String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int m = str1.length();
        int n = str2.length();
        int gcd = 1;
        int min = Math.min(m, n);
        for (int i = 2; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        return str2.substring(0, gcd);

    }

    public static boolean isPossible(int m, int n, String current_str) {


        return false;
    }
}
