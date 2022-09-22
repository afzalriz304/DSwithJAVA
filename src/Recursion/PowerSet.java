package Recursion;

import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
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

}
