package String;

public class MergeTwoString {
    public static void main(String[] args) {
        System.out.println(6%3);
        mergeAlternately("ab","pqrs");
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        int j=0;
        while (i<word1.length() && j<word2.length()){
            result.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
            j++;
        }
        while (i<word1.length()){
            result.append(word1.charAt(i));
            i++;
        }

        while (j<word2.length()){
            result.append(word2.charAt(j));
            j++;
        }
        return result.toString();
    }
}
