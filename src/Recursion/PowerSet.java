package Recursion;

import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subset(nums,new ArrayList<>(),new ArrayList<>(),0);
        System.out.println(Arrays.toString(result.toArray()));
        Set<Integer> subArray = new HashSet<>();
        List<Set> powerSet = new ArrayList<>();
        List<Set> subSet = findPowerSet(nums, 0, subArray, powerSet);
        for (Set set : subSet) {
            System.out.println(Arrays.toString(set.toArray()));
        }
    }

    private static List<Set> findPowerSet(int[] nums, int index, Set<Integer> subArray, List<Set> powerSet) {
        if (index == nums.length) {
            powerSet.add(new HashSet(subArray));
            return powerSet;
        }
        // adding to the left
        subArray.add(nums[index]);
        findPowerSet(nums, index + 1, subArray, powerSet);
        // removing from the right
        subArray.remove(nums[index]);
        findPowerSet(nums, index + 1, subArray, powerSet);

        return powerSet;
    }

    public static List<List<Integer>> subset(
            int[] nums, List<List<Integer>> result, List<Integer> sub, int index) {
        if (index == nums.length) {
            result.add(new ArrayList(sub));
            return result;
        }
        sub.add(nums[index]);
        subset(nums, result, sub, index + 1);
        sub.remove(Integer.valueOf(nums[index]));
        subset(nums, result, sub, index + 1);

        return result;
    }


}
