package reborn.Array.KSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P4_TwoSum {

    public static void main(String[] args) {
        int[] nums0 = new int[]{2, 7, 11, 15};
        int[] nums1 = new int[]{3, 2, 4};
        System.out.println(Arrays.toString(twoSumUsingMap(nums0, 9)));
        System.out.println(Arrays.toString(twoSumUsingMap(nums1, 6)));
        System.out.println(Arrays.toString(twoSumUsingMap(nums1, 4)));


        System.out.println(isTwoSumExist(nums0, 9));
        System.out.println(isTwoSumExist(nums1, 6));
        System.out.println(isTwoSumExist(nums1, 4));
    }

    private static int[] twoSumUsingMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        while (index < nums.length) {
            if (map.containsKey(k - nums[index])) {
                return new int[]{map.get(k - nums[index]), index};
            }
            map.put(nums[index], index);
            index++;
        }
        return new int[]{};
    }

    private static boolean isTwoSumExist(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] > k) {
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
