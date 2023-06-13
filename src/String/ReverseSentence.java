package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "a good   example";
        String[] str = s.trim().split(" ");
        int i = 0;
        int j = str.length - 1;
        String temp;
        while (i < j) {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        String rev = Arrays.stream(str).collect(Collectors.joining(" "));

        StringBuilder stringBuilder = new StringBuilder();
        boolean visited = false;
        for (int k = 0; k < rev.length(); k++) {
            if (rev.charAt(k) == ' ' && !visited) {
                visited = true;
                stringBuilder.append(" ");
            } else if (rev.charAt(k) != ' ') {
                visited = false;
                stringBuilder.append(rev.charAt(k));
            }
        }

        System.out.println(stringBuilder.toString());

    }
}
