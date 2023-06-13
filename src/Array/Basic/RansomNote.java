package Array.Basic;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] rCount = new int[26];
        int[] mCount = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            rCount[ransomNote.charAt(i)-'a']++;
        }
        for(int j=0;j<magazine.length();j++){
            mCount[magazine.charAt(j)-'a']++;
        }
        for(int k=0;k<rCount.length;k++){
            if(rCount[k]>mCount[k] && rCount[k]!=0)
                return false;
        }
        return true;
    }
}
