package BinarySearch.Basic;

import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 3, 4}));
        String s ="Hello World  ";
        String[] str = s.split(" ");
        /*for (int i=0;i<str.length;i++){
            if(str[i].contains(" "))
                str[i]=null;
        }*/
        String last = str[str.length-1].trim();
        System.out.println(last.toCharArray().length);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        Optional<Map.Entry<Integer, Integer>> result =
                count.entrySet().stream().max(Comparator.comparing(m -> m.getValue()));
        return result.get().getKey();

        /*int max = 0, result = 0;
        for (Map.Entry<Integer, Integer> m : count.entrySet()) {
            if (m.getValue() > max) {
                result = m.getKey();
                max=m.getValue();
            }
        }
        return result;*/
    }

    public static int majorityElementOptimal(int[] nums) {
        Arrays.sort(nums);
        int max = 0, result = 0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                if(max<j-i){
                    result=nums[i];
                    max=j-i;
                    i=j;
                }
            }
            j++;
        }
        if(max<j-i){
            return nums[i];
        }
        return result;
    }


}
