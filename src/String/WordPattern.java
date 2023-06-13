package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(82/10);
        System.out.println(82%10);
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length()!= str.length)
            return false;
        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(str[i]))
                    return false;
            }else{
                if(map.containsValue(str[i]))
                    return false;
                map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s==null || t==null)
            return false;
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            }else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
