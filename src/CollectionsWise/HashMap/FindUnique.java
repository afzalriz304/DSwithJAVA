package CollectionsWise.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUnique {

    public static void main(String[] args) {
        System.out.println(uniqueElement(Arrays.asList(1, 1, 3, 5, 5)));
    }

    public static int uniqueElement(List<Integer> arr) {
        //    Write your code here.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!map.containsKey(arr.get(i)))
                map.put(arr.get(i), 1);
            else
                map.remove(arr.get(i));
        }
        return (int) map.keySet().toArray()[0];
    }
}
