package TopicWise.SliddingWindow.VariableSize;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
        System.out.println(minWindow("BDAB","AB"));
    }

    private static String minWindow(String s, String t) {
        if(s.isEmpty() || s.length()<t.length()){
            return "";
        }
        if(s.length()==t.length() && s.equals(t))
            return s;
        String sub = "";
        char[] child = t.toCharArray();
        int count =0;
        Map<Character,Integer> map = new HashMap();
        for(Character i:child){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        count=map.size();
        char[] parent = s.toCharArray();
        int i=0;
        int j=0;
        int left =0;
        int right =0;
        boolean found =false;
        Map<Character,Integer> countMap = new HashMap<>();
        int min = s.length();
        while(j<s.length()) {
            char endChar = parent[j++];
            if(map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if(map.get(endChar)==0)
                    count--;

                if(count>0){
                    continue;
                }
                while(count==0){
                    char starChar = parent[i++];;
                    if(map.containsKey(starChar)){
                        map.put(starChar,map.get(starChar)+1);
                        if(map.get(starChar)>0){
                            count++;
                        }
                    }
                }
                if((j-i)<min){
                    left=i;
                    right=j;
                    min=j-i;

                    found =true;
                }
            }
        }
        return found?s.substring(left-1,right):"";
    }
}
