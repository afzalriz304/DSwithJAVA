package TopicWise.SliddingWindow.FixedSize.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> group = groupAnagrams(strs);
        group.stream().forEach(System.out::println);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> group = new HashMap<>();
        /**
         * overall complexity is O(nmlongm)
         */
        for (String item:strs){
            char[] itemChar = item.toCharArray();
            /*
            Size of item -> m
            complexity - m (log m)
             */
            Arrays.sort(itemChar);
            String sortedItem = new String(itemChar);
            if(!group.containsKey(sortedItem))
                group.put(sortedItem,new ArrayList<>());

            group.get(sortedItem).add(item);
        }
        result.addAll(group.values());
        return result;
    }
}
