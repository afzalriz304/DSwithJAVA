package Array.Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = findTwoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }


}
