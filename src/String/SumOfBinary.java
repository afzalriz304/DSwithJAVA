package String;

public class SumOfBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (m >= 0 && n >= 0) {
            if (a.charAt(m) == '1' && b.charAt(n) == '1') {
                if (carry == 1)
                    result.append('1');
                else
                    result.append('0');

                carry = 1;
            } else if (a.charAt(m) == '1' || b.charAt(n) == '1') {
                if (carry == 1) {
                    result.append('0');
                    carry = 1;
                } else {
                    result.append('1');
                    carry = 0;
                }
            } else {
                if(carry==1)
                    result.append('1');
                else
                    result.append('0');
                carry = 0;
            }
            m--;
            n--;
        }
        while (m >= 0) {
            if (carry == 1) {
                if (a.charAt(m) == '1') {
                    result.append('0');
                    carry = 1;
                } else {
                    result.append('1');
                    carry = 0;
                }
            } else {
                result.append(a.charAt(m));
            }
            m--;
        }
        while (n >= 0) {
            if (carry == 1) {
                if (b.charAt(m) == '1') {
                    result.append('0');
                    carry = 1;
                } else {
                    result.append('1');
                    carry = 0;
                }
            } else {
                result.append(b.charAt(m));
            }
            n--;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
